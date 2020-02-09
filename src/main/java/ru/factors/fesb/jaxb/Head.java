package ru.factors.fesb.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "http://www.w3.org/2003/05/soap-envelope", name = "Head")
@XmlAccessorType(value = XmlAccessType.FIELD)
public class Head {
    @XmlElement(namespace = "http://travelcompany.example.org/reservation", name = "reservation")
    public Reservation reservation;
    @XmlElement(namespace = "http://mycompany.example.com/employees", name = "passenger")
    public Passenger passenger;

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
}
