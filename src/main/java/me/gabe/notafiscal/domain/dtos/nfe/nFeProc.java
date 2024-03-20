package me.gabe.notafiscal.domain.dtos.nfe;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class nFeProc {
    @XStreamAsAttribute
    private eNFe NFe;
    private eProtNFe protNFe;
}
