package com.ttn.JPAWithHibernatePart2.InheritanceMapping.SingleTable.repo;

import com.ttn.JPAWithHibernatePart2.InheritanceMapping.SingleTable.entity.PaymentSingleTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SingleTableRepo extends JpaRepository<PaymentSingleTable,Integer> {
}
