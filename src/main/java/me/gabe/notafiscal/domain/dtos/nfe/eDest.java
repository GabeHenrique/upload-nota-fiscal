package me.gabe.notafiscal.domain.dtos.nfe;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class eDest {
  public String CNPJ;
  public String CPF;
  public String xNome;
  public eEnderDest enderDest;
  public String indIEDest;
  public String IE;
  public String email;
}

