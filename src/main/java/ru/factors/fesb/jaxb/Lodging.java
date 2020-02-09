package ru.factors.fesb.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
@XmlAccessorType(value = XmlAccessType.FIELD)
public class Lodging {
    @XmlElement(namespace = "http://travelcompany.example.org/reservation/hotels")
    public String preference;

    public String getPreference() {
        return preference;
    }

    public void setPreference(String preference) {
        this.preference = preference;
    }
}
