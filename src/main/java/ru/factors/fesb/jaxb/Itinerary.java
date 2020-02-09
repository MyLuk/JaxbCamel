package ru.factors.fesb.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "http://travelcompany.example.org/reservation/travel", name = "itinerary")
@XmlAccessorType(value = XmlAccessType.FIELD)
public class Itinerary {
    @XmlElement(namespace = "http://travelcompany.example.org/reservation/travel", name = "departure")
    public Departure departure;

    @XmlElement(namespace = "http://travelcompany.example.org/reservation/travel", name = "return")
    public Return returnV;

    public Departure getDeparture() {
        return departure;
    }

    public void setDeparture(Departure departure) {
        this.departure = departure;
    }

    public Return getReturnV() {
        return returnV;
    }

    public void setReturnV(Return returnV) {
        this.returnV = returnV;
    }
}
