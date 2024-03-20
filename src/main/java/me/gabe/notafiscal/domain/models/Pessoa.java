package me.gabe.notafiscal.domain.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.gabe.notafiscal.domain.enums.TipoPessoa;

import java.util.UUID;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pessoa")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_pessoa")
    private UUID id;

    @Column(name = "nome", length = 150)
    private String nome;

    @Column(name = "cnpj", length = 14)
    private String cnpj;

    @Column(name = "cpf", length = 11)
    private String cpf;

    @Column(name = "tp_pessoa", length = 25)
    @Enumerated(EnumType.STRING)
    private TipoPessoa tipoPessoa;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_endereco", foreignKey = @ForeignKey(name = "fk_endereco_pessoa"))
    private Endereco endereco;

    @Column(name = "insc_estadual", length = 25)
    private String inscricaoEstadual;

    @Column(name = "insc_municipal", length = 25)
    private String inscricaoMunicipal;

}
