package com.ttn.JPAWithHibernatePart3.OneToManyMapping.UniDirectional.Entity;
import javax.persistence.Embeddable;

@Embeddable
public class AddressOneToManyUniDirectional {
    private Integer streetNumber;
    private String location;
    private String street;

    public AddressOneToManyUniDirectional(){

    }

    public Integer getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(Integer streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
