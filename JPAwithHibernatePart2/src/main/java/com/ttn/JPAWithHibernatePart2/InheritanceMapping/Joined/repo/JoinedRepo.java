package com.ttn.JPAWithHibernatePart2.InheritanceMapping.Joined.repo;

import com.ttn.JPAWithHibernatePart2.InheritanceMapping.Joined.entity.PaymentJoined;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JoinedRepo extends JpaRepository<PaymentJoined,Integer> {
}
