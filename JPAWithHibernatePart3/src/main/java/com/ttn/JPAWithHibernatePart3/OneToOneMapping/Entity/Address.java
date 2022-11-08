package com.ttn.JPAWithHibernatePart3.OneToOneMapping.Entity;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

  private Integer streetNumber;
  private String location;
  private String street;

  public Address() {

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