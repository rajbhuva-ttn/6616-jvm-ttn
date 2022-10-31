package com.ttn.JPAWithHibernatePart2;

import com.ttn.JPAWithHibernatePart2.Jpqlandnativesql.entity.EmbeddedEmployee;
import com.ttn.JPAWithHibernatePart2.Jpqlandnativesql.entity.Salary;
import com.ttn.JPAWithHibernatePart2.Jpqlandnativesql.repository.EmbeddedEmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ComponentMappingTest {
    @Autowired
    EmbeddedEmployeeRepository embeddedEmployeeRepository;
    @Test
    void contextLoads() {
    }

    @Test
    public void testAddEmployee(){
        EmbeddedEmployee emp1 = new EmbeddedEmployee();
        emp1.setFirstName("Raj");
        emp1.setLastName("Bhuva");
        emp1.setAge(21);
        Salary sal = new Salary();
        sal.setBasicSalary(10000);
        sal.setBonusSalary(5000);
        sal.setTaxAmount(1000);
        sal.setSpecialAllowanceSalary(6000);
        emp1.setSalary(sal);
        embeddedEmployeeRepository.save(emp1);
    }
}
