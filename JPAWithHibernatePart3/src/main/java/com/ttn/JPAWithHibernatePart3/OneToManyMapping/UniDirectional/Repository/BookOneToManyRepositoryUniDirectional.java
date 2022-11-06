package com.ttn.JPAWithHibernatePart3.OneToManyMapping.UniDirectional.Repository;

import com.ttn.JPAWithHibernatePart3.OneToManyMapping.UniDirectional.Entity.BookOneToManyUniDirectional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*** Created Book repository here **/
@Repository
public interface BookOneToManyRepositoryUniDirectional extends JpaRepository<BookOneToManyUniDirectional, Long> {
}
