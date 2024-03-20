package seu.pacote.aqui;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemNotaFiscalDto {
  private String codigo;
  private String descricao;
  private String unidadeMedida;
  private BigDecimal quantidade;
  private BigDecimal valorTotal;
  private BigDecimal valorUnitario;
  private String codigoEan;
}
