package com.ttn.JPAWithHibernatePart3.OneToManyMapping.BiDirectional.Entity;

import javax.persistence.Embeddable;

/*** Created an Embeddable class for Address here ***/
@Embeddable
public class AddressOneToManyBiDirectional {
    /*** Created some required fields here ***/
    private Integer streetNumber;
    private String location;
    private String street;

    /*** Constructor, getters and setters below ***/
    public AddressOneToManyBiDirectional(){

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

