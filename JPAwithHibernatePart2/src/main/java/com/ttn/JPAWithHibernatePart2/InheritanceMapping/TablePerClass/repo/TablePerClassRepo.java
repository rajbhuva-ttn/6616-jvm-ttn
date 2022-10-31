package com.ttn.JPAWithHibernatePart2.InheritanceMapping.TablePerClass.repo;

import com.ttn.JPAWithHibernatePart2.InheritanceMapping.TablePerClass.entity.PaymentTablePerClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TablePerClassRepo extends JpaRepository<PaymentTablePerClass,Integer> {
}
