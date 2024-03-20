package me.gabe.notafiscal.domain.dtos.nfe;

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class eProd {
    private String cProd;
    private String cEAN;
    private String xProd;
    private String NCM;
    private String CFOP;
    private String uCom;
    private String qCom;
    private String vUnCom;
    private String vProd;
    private String cEANTrib;
    private String uTrib;
    private String qTrib;
    private String vUnTrib;
    private String vFrete;
    private String vSeg;
    private String vDesc;
    private String vOutro;
    private String indTot;
    private String xPed;
    private String nItemPed;
    private String infAdProd;
    private String nFCI;

    @XStreamImplicit(itemFieldName = "rastro")
    private List<rastro> rastros;
    private String CEST;
}
