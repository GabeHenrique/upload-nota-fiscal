package me.gabe.notafiscal.domain.dtos.nfe;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class eTransp {
  private String modFrete;
  private String cnpj;
  private String xNome;
  private String ie;
  private String xEnder;
  private String xMun;
  private String UF;
  private String qVol;
  private String esp;
  private String pesoL;
  private String pesoB;
  private eTransporta transporta;
  private eVol vol;
}
