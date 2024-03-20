package me.gabe.notafiscal.domain.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "nota_fiscal")
public class NotaFiscal {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "id_nota_fiscal")
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
  @JoinColumn(name = "id_emitente", foreignKey = @ForeignKey(name = "fk_emitente_notafiscal"))
  private Pessoa emitente;

  @ManyToOne
  @JoinColumn(name = "id_destinatario", foreignKey = @ForeignKey(name = "fk_destinatario_notafiscal"))
  private Pessoa destinatario;

  @Column(name = "vl_nota", columnDefinition = "numeric(12,2)")
  private BigDecimal valorTotal;

  @Column(name = "forma_pagamento", length = 50)
  private String codFormaPagamento;

  @Column(name = "vl_desconto", columnDefinition = "numeric(12,2)")
  private BigDecimal valorDesconto;

  @Column(name = "vl_liquido", columnDefinition = "numeric(12,2)")
  private BigDecimal valorLiquido;

  @OneToMany(mappedBy = "notaFiscal", cascade = CascadeType.ALL)
  private List<ItemNotaFiscal> itens;

  @Column(name = "string_xml", columnDefinition = "text")
  private String xmlString;

  @Column(name = "obs_nota_fiscal")
  private String observacaoNotaFiscal;

  @Column(name = "serie_nota_fiscal", length = 10)
  private String serieNotaFiscal;
}
