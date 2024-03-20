package me.gabe.notafiscal.domain.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_produto")
    private UUID id;

    @Column(name = "descricao", length = 150)
    private String descricao;

    @Column(name = "codigo", length = 100)
    private String codigo;

    @Column(name = "unidade_medida", length = 10)
    private String unidadeMedida;

    @Column(name = "vl_unitario", columnDefinition = "numeric(12,2)")
    private BigDecimal valorUnitario;

    @Column(name = "cod_ean", length = 150)
    private String codigoEan;

    @Column(name = "qtd_estoque", columnDefinition = "numeric(15,4)")
    private BigDecimal quantidadeEstoque;
}
