package ru.factors.fesb.jaxb;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "http://travelcompany.example.org/reservation/travel/travel")
@XmlAccessorType(value = XmlAccessType.FIELD)
public class Return {
    @XmlElement(namespace = "http://travelcompany.example.org/reservation/travel")
    public String departing;
    @XmlElement(namespace = "http://travelcompany.example.org/reservation/travel")
    public String arriving;
    @XmlElement(namespace = "http://travelcompany.example.org/reservation/travel")
    public String departureDate;
    @XmlElement(namespace = "http://travelcompany.example.org/reservation/travel")
    public String departureTime;
    @XmlElement(namespace = "http://travelcompany.example.org/reservation/travel")
    public String seatPreference;

    public String getDeparting() {
        return departing;
    }

    public void setDeparting(String departing) {
        this.departing = departing;
    }

    public String getArriving() {
        return arriving;
    }

    public void setArriving(String arriving) {
        this.arriving = arriving;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getSeatPreference() {
        return seatPreference;
    }

    public void setSeatPreference(String seatPreference) {
        this.seatPreference = seatPreference;
    }
}
