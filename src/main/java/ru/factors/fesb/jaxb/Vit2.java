package ru.factors.fesb.jaxb;

import javax.xml.bind.annotation.*;
import java.util.Date;

@XmlRootElement(name = "vit2")
@XmlAccessorType(XmlAccessType.FIELD)
public class Vit2 {

    @XmlValue()
    protected String name;
    @XmlAttribute(name = "date")
    protected Date date;

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date value) {
        this.date = value;
    }
}
