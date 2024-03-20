package me.gabe.notafiscal.domain.dtos.nfe;

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class eInfNFe {
    private String id;
    private eIde ide;
    private eEmit emit;
    private eDest dest;
    private eEntrega entrega;
    @XStreamImplicit(itemFieldName = "det")
    private List<eDet> det;
    private eTransp transp;
}
