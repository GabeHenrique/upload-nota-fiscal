package seu.pacote.aqui;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotaFiscalDto {
  private String cnpjEmitente;
  private String razaoSocialEmitente;
  private String numeroNota;
  private LocalDateTime dataEmissao;
  private String chaveAcesso;
  private BigDecimal valorTotal;
  private String codFormaPagamento;
  private BigDecimal valorDesconto;
  private BigDecimal valorLiquido;
  private String observacaoNotaFiscal;
  private String serieNotaFiscal;
}
