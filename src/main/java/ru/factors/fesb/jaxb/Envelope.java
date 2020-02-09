package ru.factors.fesb.jaxb;

import javax.xml.bind.annotation.*;
import java.util.Date;


@XmlRootElement(namespace = "http://www.w3.org/2003/05/soap-envelope", name = "Envelope")
@XmlAccessorType(value = XmlAccessType.FIELD)
public class Envelope {
    @XmlElement(namespace = "http://www.w3.org/2003/05/soap-envelope",name = "Head")
    public Head head;
    @XmlElement(namespace = "http://www.w3.org/2003/05/soap-envelope",name = "Body")
    public Body body;

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }
}
