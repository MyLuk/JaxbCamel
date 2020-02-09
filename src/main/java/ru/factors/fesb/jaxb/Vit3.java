package ru.factors.fesb.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement()
@XmlAccessorType(value = XmlAccessType.FIELD)
public class Vit3 {

    @XmlElement
    private List Vit1s;

    public List getVit1s() {
        return Vit1s;
    }

    public void setVit1s(List vit1s) {
        Vit1s = vit1s;
    }
}