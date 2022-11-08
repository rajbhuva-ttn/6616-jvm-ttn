package com.ttn.JPAWithHibernatePart3.OneToOneMapping.Service;

import com.ttn.JPAWithHibernatePart3.OneToOneMapping.Entity.AuthorOneToOne;

import org.springframework.stereotype.Component;

@Component
public interface AuthorService {

  AuthorOneToOne saveAuthor(AuthorOneToOne author);

  AuthorOneToOne findAuthorByAuthorId(int authorId);
}
