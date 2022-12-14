package com.ttn.JPAWithHibernatePart3.OneToOneMapping.Service;

import com.ttn.JPAWithHibernatePart3.OneToOneMapping.Entity.AuthorOneToOne;
import com.ttn.JPAWithHibernatePart3.OneToOneMapping.Entity.BookOneToOne;
import com.ttn.JPAWithHibernatePart3.OneToOneMapping.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

  @Autowired
  private AuthorRepository authorRepository;

  public AuthorOneToOne saveAuthor(AuthorOneToOne author) {
    BookOneToOne book = author.getBook();
    book.setAuthor(author);
    author = authorRepository.save(author);
    return author;
  }

  public AuthorOneToOne findAuthorByAuthorId(int authorId) {
    AuthorOneToOne author = authorRepository.findAuthorByAuthorId(authorId);
    return author;
  }
}
