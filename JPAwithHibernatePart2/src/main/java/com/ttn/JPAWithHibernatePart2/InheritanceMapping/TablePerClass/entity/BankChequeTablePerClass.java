package com.ttn.JPAWithHibernatePart2.InheritanceMapping.TablePerClass.entity;

import javax.persistence.Entity;

import javax.persistence.Table;

@Entity
@Table(name = "BankCheck")
public class BankChequeTablePerClass extends PaymentTablePerClass {
    private String checkNumber;

    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }
}