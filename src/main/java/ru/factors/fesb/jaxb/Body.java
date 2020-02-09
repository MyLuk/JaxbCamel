package ru.factors.fesb.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "http://travelcompany.example.org/reservation/hotels", name = "Body")
@XmlAccessorType(value = XmlAccessType.FIELD)
public class Body {
    @XmlElement(namespace = "http://travelcompany.example.org/reservation/travel")
    public Itinerary itinerary;
    @XmlElement(namespace = "http://travelcompany.example.org/reservation/hotels")
    public Lodging lodging;

    public Itinerary getItinerary() {
        return itinerary;
    }

    public void setItinerary(Itinerary itinerary) {
        this.itinerary = itinerary;
    }

    public Lodging getLodging() {
        return lodging;
    }

    public void setLodging(Lodging lodging) {
        this.lodging = lodging;
    }
}
