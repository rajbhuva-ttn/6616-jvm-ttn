package com.ttn.JPAWithHibernatePart2.InheritanceMapping.SingleTable.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("ch")
public class BankChequeSingleTable extends PaymentSingleTable {
    private String checkNumber;

    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }
}

