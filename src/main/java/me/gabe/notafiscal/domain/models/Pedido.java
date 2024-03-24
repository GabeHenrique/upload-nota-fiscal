package me.gabe.notafiscal.domain.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.gabe.notafiscal.domain.enums.TipoEndereco;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pedido")
public class Pedido {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "id_pedido")
  private UUID id;

  @Column(name = "cnpj_emit", length = 14)
  private String cnpjEmitente = "";

  @Column(name = "razao_social_emit", length = 150)
  private String razaoSocialEmitente = "";

  @Column(name = "numero_nota", length = 150)
  private String numeroNota;

  @Column(name = "dt_nf")
  private LocalDateTime dataEmissao;

  @Column(name = "chave_acesso", length = 100)
  private String chaveAcesso;

  @ManyToOne
  @JoinColumn(name = "id_cliente", foreignKey = @ForeignKey(name = "fk_pedido_cliente"))
  private Pessoa cliente;

  @Column(name = "vl_nota", columnDefinition = "numeric(12,2)")
  private BigDecimal valorTotal;

  @Column(name = "forma_pagamento", length = 50)
  private String codFormaPagamento;

  @Column(name = "vl_desconto", columnDefinition = "numeric(12,2)")
  private BigDecimal valorDesconto;

  @Column(name = "vl_liquido", columnDefinition = "numeric(12,2)")
  private BigDecimal valorLiquido;

  @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
  private List<ItemPedido> itens;

  @Column(name = "string_xml", columnDefinition = "text")
  private String xmlString;

  @Column(name = "obs_nota_fiscal")
  private String observacaoNotaFiscal;

  @Column(name = "serie_nota_fiscal", length = 10)
  private String serieNotaFiscal;

  @Column(name = "tipo_endereco", length = 50)
  @Enumerated(EnumType.STRING)
  private TipoEndereco tipoEndereco;

  @OneToOne(cascade = CascadeType.ALL, targetEntity = Endereco.class)
  @JoinColumn(name = "id_endereco", foreignKey = @ForeignKey(name = "fk_pedido_endereco"))
  private Endereco endereco;
}
