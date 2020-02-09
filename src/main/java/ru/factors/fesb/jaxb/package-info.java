@XmlSchema(xmlns = {
        @XmlNs(prefix = "env", namespaceURI = "http://www.w3.org/2003/05/soap-envelope"),
        @XmlNs(prefix = "m", namespaceURI = "http://travelcompany.example.org/reservation"),
        @XmlNs(prefix = "p", namespaceURI = "http://travelcompany.example.org/reservation/travel"),
        @XmlNs(prefix = "q", namespaceURI = "http://travelcompany.example.org/reservation/hotels"),
        @XmlNs(prefix = "n", namespaceURI = "http://mycompany.example.com/employees")
                },elementFormDefault = XmlNsForm.QUALIFIED)
package ru.factors.fesb.jaxb;

import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;