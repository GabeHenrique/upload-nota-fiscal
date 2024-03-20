package me.gabe.notafiscal.domain.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.gabe.notafiscal.domain.enums.TipoEndereco;

import java.util.UUID;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "endereco")
public class Endereco {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "id_endereco")
  private UUID id;

  @Column(name = "cep", length = 12)
  private String cep;

  @Column(name = "uf", length = 2)
  private String uf;

  @Column(name = "cod_uf", length = 10)
  private String codigoUf;

  @Column(name = "cidade", length = 150)
  private String cidade;

  @Column(name = "cod_cidade", length = 10)
  private String codigoCidade;

  @Column(name = "bairro", length = 150)
  private String bairro;

  @Column(name = "endereco")
  private String endereco;

  @Column(name = "numero_end", length = 25)
  private String numeroEndereco;

  @Column(name = "complemento_end", length = 150)
  private String complementoEndereco;

  @Column(name = "telefone", length = 15)
  private String telefone;

  @Column(name = "pais_end", length = 150)
  private String pais = "";

  @Column(name = "cod_pais", length = 100)
  private String codigoPais;

  @Enumerated(EnumType.STRING)
  @Column(name = "tp_endereco_emit", length = 50)
  private TipoEndereco tipoEnderecoEmitente;
}
