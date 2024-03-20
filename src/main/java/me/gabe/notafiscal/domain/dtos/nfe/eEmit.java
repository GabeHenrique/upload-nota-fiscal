package me.gabe.notafiscal.domain.dtos.nfe;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class eEmit {
  private String CPF;
  private String CNPJ;
  private String xNome;
  private String xFant;
  private String IE;
  private String IM;
  private String CRT;
  private String CNAE;
  private eEnderEmit enderEmit;
}
