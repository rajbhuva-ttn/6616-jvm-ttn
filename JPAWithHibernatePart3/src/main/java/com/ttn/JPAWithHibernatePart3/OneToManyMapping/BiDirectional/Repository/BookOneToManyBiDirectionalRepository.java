package com.ttn.JPAWithHibernatePart3.OneToManyMapping.BiDirectional.Repository;

import com.ttn.JPAWithHibernatePart3.OneToManyMapping.BiDirectional.Entity.BookOneToManyBiDirectional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookOneToManyBiDirectionalRepository extends JpaRepository<BookOneToManyBiDirectional, Long> {
}
