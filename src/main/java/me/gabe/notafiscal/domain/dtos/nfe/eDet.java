package me.gabe.notafiscal.domain.dtos.nfe;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class eDet {
    @XStreamAsAttribute
    private String nItem;
    private eProd prod;
}
