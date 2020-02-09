package ru.factors.fesb.jaxb;

import javax.xml.bind.annotation.*;

@XmlRootElement()
@XmlAccessorType(value = XmlAccessType.FIELD)
public class Reservation {
    @XmlAttribute(namespace = "http://travelcompany.example.org/reservation")
    public String role;
    @XmlAttribute(namespace = "http://travelcompany.example.org/reservation")
    public Boolean mustUnderstand;
    @XmlElement(namespace = "http://travelcompany.example.org/reservation")
    public String reference;
    @XmlElement(namespace = "http://travelcompany.example.org/reservation")
    public String dateAndTime;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Boolean getMustUnderstand() {
        return mustUnderstand;
    }

    public void setMustUnderstand(Boolean mustUnderstand) {
        this.mustUnderstand = mustUnderstand;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(String dateAndTime) {
        this.dateAndTime = dateAndTime;
    }
}
