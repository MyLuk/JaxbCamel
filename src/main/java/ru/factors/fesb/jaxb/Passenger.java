package ru.factors.fesb.jaxb;

import javax.xml.bind.annotation.*;

@XmlRootElement()
@XmlAccessorType(value = XmlAccessType.FIELD)
public class Passenger {
    @XmlAttribute(namespace = "http://mycompany.example.com/employees")
    public String role;
    @XmlAttribute(namespace = "http://mycompany.example.com/employees")
    public Boolean mustUnderstand;
    @XmlElement(namespace = "http://mycompany.example.com/employees")
    public String name;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
