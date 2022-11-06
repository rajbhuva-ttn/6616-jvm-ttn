package com.ttn.JPAWithHibernatePart3.OneToOneMapping.Repository;


import com.ttn.JPAWithHibernatePart3.OneToOneMapping.Entity.AuthorOneToOne;
import org.springframework.data.jpa.repository.JpaRepository;

/*** Created an AuthorRepository here ***/
public interface AuthorRepository extends JpaRepository<AuthorOneToOne, String> {
  AuthorOneToOne findAuthorByAuthorId(int authorId);
}
