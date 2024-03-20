package seu.pacote.aqui;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.gabe.notafiscal.domain.enums.TipoEndereco;
import me.gabe.notafiscal.domain.models.Endereco;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoDto {
    private String cep;
    private String uf;
    private String codigoUf;
    private String cidade;
    private String codigoCidade;
    private String bairro;
    private String endereco;
    private String numeroEndereco;
    private String telefone;
    private String pais;
    private String codigoPais;
    private TipoEndereco tipoEnderecoEmitente;

    public Endereco toEntity() {
        Endereco endereco = new Endereco();
        endereco.setCep(this.cep);
        endereco.setUf(this.uf);
        endereco.setCodigoUf(this.codigoUf);
        endereco.setCidade(this.cidade);
        endereco.setCodigoCidade(this.codigoCidade);
        endereco.setBairro(this.bairro);
        endereco.setEndereco(this.endereco);
        endereco.setNumeroEndereco(this.numeroEndereco);
        endereco.setTelefone(this.telefone);
        endereco.setPais(this.pais);
        endereco.setCodigoPais(this.codigoPais);
        endereco.setTipoEnderecoEmitente(this.tipoEnderecoEmitente);
        return endereco;
    }
}
