package seu.pacote.aqui;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.gabe.notafiscal.domain.enums.TipoPessoa;

import java.io.Serializable;

import static me.gabe.notafiscal.utils.DocumentUtils.isCnpj;
import static me.gabe.notafiscal.utils.DocumentUtils.isCpf;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class PessoaDto implements Serializable {

  private String nome;
  private String documento;
  private String inscricaoEstadual;
  private String inscricaoMunicipal;

  public TipoPessoa getTipoPessoa() {
    if (isCpf(documento)) {
      return TipoPessoa.FISICA;
    } else if (isCnpj(documento)) {
      return TipoPessoa.JURIDICA;
    } else {
      throw new IllegalArgumentException("Documento inválido");
    }
  }
}
