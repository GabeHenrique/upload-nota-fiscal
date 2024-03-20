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
@Table(name = "item_nota_fiscal")
public class ItemNotaFiscal {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_item_nota_fiscal")
    private UUID id;

    @Column(name = "descricao", length = 150)
    private String descricao;

    @Column(name = "codigo", length = 100)
    private String codigo;

    @Column(name = "unidade_nf", length = 10)
    private String unidadeMedida;

    @Column(name = "quantidade", columnDefinition = "numeric(15,4)")
    private BigDecimal quantidade;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_nota_fiscal", foreignKey = @ForeignKey(name = "fk_nota_fiscal_item"))
    private NotaFiscal notaFiscal;

    @Column(name = "vl_total", columnDefinition = "numeric(12,2)")
    private BigDecimal valorTotal;

    @Column(name = "vl_unitario", columnDefinition = "numeric(12,2)")
    private BigDecimal valorUnitario;

    @Column(name = "cod_ean", length = 150)
    private String codigoEan;
}
