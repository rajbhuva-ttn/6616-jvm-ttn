package com.ttn.JPAWithHibernatePart2.InheritanceMapping.TablePerClass.entity;

import javax.persistence.Entity;

@Entity
public class CreditCardTablePerClass extends PaymentTablePerClass {
    private String cardNumber;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}