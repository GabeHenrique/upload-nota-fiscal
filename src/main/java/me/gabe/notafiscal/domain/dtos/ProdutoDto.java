package me.gabe.notafiscal.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoDto {
  private String descricao;
  private String codigo;
  private String unidadeMedida;
  private String valorUnitario;
  private String codigoEan;
}
