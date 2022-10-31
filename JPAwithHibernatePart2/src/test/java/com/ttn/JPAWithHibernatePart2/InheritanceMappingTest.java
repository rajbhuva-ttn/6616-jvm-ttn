package com.ttn.JPAWithHibernatePart2;

import com.ttn.JPAWithHibernatePart2.InheritanceMapping.Joined.entity.CreditCardJoined;
import com.ttn.JPAWithHibernatePart2.InheritanceMapping.Joined.repo.JoinedRepo;
import com.ttn.JPAWithHibernatePart2.InheritanceMapping.SingleTable.entity.CreditCardSingleTable;
import com.ttn.JPAWithHibernatePart2.InheritanceMapping.SingleTable.repo.SingleTableRepo;
import com.ttn.JPAWithHibernatePart2.InheritanceMapping.TablePerClass.entity.CreditCardTablePerClass;
import com.ttn.JPAWithHibernatePart2.InheritanceMapping.TablePerClass.repo.TablePerClassRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class InheritanceMappingTest {
    @Autowired
    SingleTableRepo singleTableRepo;

    @Autowired
    TablePerClassRepo tablePerClassRepo;

    @Autowired
    JoinedRepo joinedRepo;

    @Test
    void contextLoads() {

    }

    @Test
    public void testCreatePaymentSingleStrategy(){
        CreditCardSingleTable singleTableStrategyCreditCard = new CreditCardSingleTable();
        singleTableStrategyCreditCard.setCardNumber("123456789");
        singleTableStrategyCreditCard.setAmount(10000);
        singleTableRepo.save(singleTableStrategyCreditCard);
    }

    @Test
    public void  testCeatePaymentTablePerClassStrategy(){
        CreditCardTablePerClass tablePerClassStrategyCreditCard = new CreditCardTablePerClass();
        tablePerClassStrategyCreditCard.setCardNumber("123456789");
        tablePerClassStrategyCreditCard.setAmount(10000);
        tablePerClassRepo.save(tablePerClassStrategyCreditCard);
    }

    @Test
    public void testCreatePaymentJoinedStrategy(){
        CreditCardJoined joinedStrategyCreditCard = new CreditCardJoined();
        joinedStrategyCreditCard.setCardNumber("123456789");
        joinedStrategyCreditCard.setAmount(10000);
        joinedRepo.save(joinedStrategyCreditCard);
    }

}
