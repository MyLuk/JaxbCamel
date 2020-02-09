package ru.factors.fesb.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class MainVit1 {
    static public void main(String args[]){
        Reservation reservation = new Reservation();
        reservation.setRole("http://www.w3.org/2003/05/soap-envelope/role/next");
        reservation.setMustUnderstand(true);
        reservation.setDateAndTime("2001-11-29T13:20:00.000-05:00");
        reservation.setReference("uuid:093a2da1-q345-739r-ba5d-pqff98fe8j7d");
        Passenger passenger = new Passenger();
        passenger.setRole("http://www.w3.org/2003/05/soap-envelope/role/next");
        passenger.setMustUnderstand(true);
        passenger.setName("Mikhail");
        Head head = new Head();
        head.setPassenger(passenger);
        head.setReservation(reservation);
        Envelope envelope = new Envelope();
        envelope.setHead(head);
        Departure departure = new Departure();
        departure.setSeatPreference("aisle");
        departure.setArriving("London");
        departure.setDeparting("Moscow");
        departure.setDepartureDate("2001-12-14");
        departure.setDepartureTime("2001-12-14");
        Return returnV = new Return();
        returnV.setArriving("London");
        returnV.setDeparting("Moscow");
        returnV.setDepartureDate("2001-12-14");
        returnV.setDepartureTime("2001-12-14");
        Itinerary itinerary = new Itinerary();
        itinerary.setDeparture(departure);
        itinerary.setReturnV(returnV);
        Lodging lodging = new Lodging();
        lodging.setPreference("none");
        Body body = new Body();
        body.setItinerary(itinerary);
        body.setLodging(lodging);
        envelope.setBody(body);
        try {
            File file = new File("env.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Envelope.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            marshaller.marshal(envelope, file);
            marshaller.marshal(envelope, System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}

