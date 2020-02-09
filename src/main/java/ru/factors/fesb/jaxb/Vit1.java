package ru.factors.fesb.jaxb;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement()//корневой тег  xml  документа
public class Vit1  implements Serializable{
    @XmlElement()//вложенный тег в корневой тег xml документа
    public String name;
    @XmlAttribute//атрибут корневого тега
    public Date date;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }


    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return new String("[ name= "+name+", date= "+date.toString()+" ]");
    }
}