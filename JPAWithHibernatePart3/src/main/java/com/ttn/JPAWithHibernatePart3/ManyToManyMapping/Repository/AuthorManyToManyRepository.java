package com.ttn.JPAWithHibernatePart3.ManyToManyMapping.Repository;

import com.ttn.JPAWithHibernatePart3.ManyToManyMapping.Entity.AuthorManyToMany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorManyToManyRepository extends JpaRepository<AuthorManyToMany, Long> {
}
