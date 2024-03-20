package me.gabe.notafiscal.domain.dtos.nfe;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class eNFe {
  private String mensagemErro;
  private boolean error;
  private eInfNFe infNFe;
  private String xmlNFe;
}
