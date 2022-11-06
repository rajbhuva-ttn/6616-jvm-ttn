package com.ttn.JPAWithHibernatePart3.OneToManyMapping.BiDirectional.Repository;

import com.ttn.JPAWithHibernatePart3.OneToManyMapping.BiDirectional.Entity.AuthorOneToManyBiDirectional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*** Created a repository for Author ***/
@Repository
public interface AuthorOneToManyBiDirectionalRepository extends JpaRepository<AuthorOneToManyBiDirectional,Long> {
}
