package com.ttn.JPAWithHibernatePart3;

import com.ttn.JPAWithHibernatePart3.EmbeddedAndPersistence.Entity.Addresss;
import com.ttn.JPAWithHibernatePart3.EmbeddedAndPersistence.Entity.Author;
import com.ttn.JPAWithHibernatePart3.EmbeddedAndPersistence.Entity.Subject;
import com.ttn.JPAWithHibernatePart3.EmbeddedAndPersistence.Repository.EmbeddedAuthorRepository;
import com.ttn.JPAWithHibernatePart3.ManyToManyMapping.Entity.Address;
import com.ttn.JPAWithHibernatePart3.ManyToManyMapping.Entity.AuthorManyToMany;
import com.ttn.JPAWithHibernatePart3.ManyToManyMapping.Entity.BookManyToMany;
import com.ttn.JPAWithHibernatePart3.ManyToManyMapping.Repository.AuthorManyToManyRepository;
import com.ttn.JPAWithHibernatePart3.OneToManyMapping.BiDirectional.Entity.AddressOneToManyBiDirectional;
import com.ttn.JPAWithHibernatePart3.OneToManyMapping.BiDirectional.Entity.AuthorOneToManyBiDirectional;
import com.ttn.JPAWithHibernatePart3.OneToManyMapping.BiDirectional.Entity.BookOneToManyBiDirectional;
import com.ttn.JPAWithHibernatePart3.OneToManyMapping.BiDirectional.Repository.AuthorOneToManyBiDirectionalRepository;
import com.ttn.JPAWithHibernatePart3.OneToManyMapping.UniDirectional.Entity.AddressOneToManyUniDirectional;
import com.ttn.JPAWithHibernatePart3.OneToManyMapping.UniDirectional.Entity.AuthorOneToManyUniDirectional;
import com.ttn.JPAWithHibernatePart3.OneToManyMapping.UniDirectional.Entity.BookOneToManyUniDirectional;
import com.ttn.JPAWithHibernatePart3.OneToManyMapping.UniDirectional.Repository.AuthorOneToManyRepositoryUniDirectional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JpaWithHibernatePart3Tests {
    @Autowired
    EmbeddedAuthorRepository embeddedAuthorRepository;
    @Autowired
    private AuthorManyToManyRepository authorRepository;
    @Autowired
    private AuthorOneToManyRepositoryUniDirectional authorOneToManyRepositoryUniDirectional;
    @Autowired
    private AuthorOneToManyBiDirectionalRepository authorOneToManyBiDirectionalRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void testPersistence() {
        Author author = new Author();

        author.setAuthorId(1);
        author.setName("Raj Bhuva");
        author.setGender("Male");
        author.setEmail("rajbhuva@gmail.com");

        Addresss authorAddress = new Addresss();
        authorAddress.setStreetNumber(4);
        authorAddress.setStreet("canalroad");
        authorAddress.setLocation("noida");
        author.setAddress(authorAddress);

        author.getSubjectList().add(new Subject("Maths"));
        author.getSubjectList().add(new Subject("Physics"));
        author.getSubjectList().add(new Subject("Chemistry"));
        embeddedAuthorRepository.save(author);
    }

    @Test
    void testManyToManyMapping() {
        AuthorManyToMany author = new AuthorManyToMany();
        author.setAuthorId(1L);
        author.setAuthor_name("Raj Bhuva");
        author.setAuthor_gender("Male");
        author.setAuthor_email("rajbhuva123@gmail.com");

        Address authorAddress = new Address();
        authorAddress.setStreetNumber(4);
        authorAddress.setStreet("canalroad");
        authorAddress.setLocation("noida");

        author.setAuthor_address(authorAddress);

        BookManyToMany book1 = new BookManyToMany();
        book1.setBook_id(1L);
        book1.setBook_name("Maths");

        BookManyToMany book2 = new BookManyToMany();
        book2.setBook_id(2L);
        book2.setBook_name("Science");

        author.getBooks().add(book1);
        author.getBooks().add(book2);

        book1.getAuthors().add(author);
        book2.getAuthors().add(author);

        authorRepository.save(author);
    }

    @Test
    void testOneToManyUniDirectional() {
        AuthorOneToManyUniDirectional author = new AuthorOneToManyUniDirectional();
        author.setName("Raj Bhuva");
        author.setEmail("rajbhuva@gmail.com");
        author.setGender("Male");
        author.setAuthorId(1L);

        AddressOneToManyUniDirectional address = new AddressOneToManyUniDirectional();
        address.setStreetNumber(4);
        address.setLocation("canalroad");
        address.setStreet("Noida");

        author.setAddress(address);

        BookOneToManyUniDirectional book1 = new BookOneToManyUniDirectional();
        book1.setBookId(1L);
        book1.setBookName("Maths");

        BookOneToManyUniDirectional book2 = new BookOneToManyUniDirectional();
        book2.setBookId(2L);
        book2.setBookName("Science");

        author.getBooks().add(book1);
        author.getBooks().add(book2);

        authorOneToManyRepositoryUniDirectional.save(author);
    }

    @Test
    void testOneToManyBiDirectional() {
        AuthorOneToManyBiDirectional author = new AuthorOneToManyBiDirectional();
        author.setName("Raj Bhuva");
        author.setEmail("rajbhuva@gmail.com");
        author.setGender("Male");
        author.setAuthorId(1L);

        AddressOneToManyBiDirectional authorAddress = new AddressOneToManyBiDirectional();
        authorAddress.setStreetNumber(4);
        authorAddress.setStreet("canalroad");
        authorAddress.setLocation("noida");

        author.setAddress(authorAddress);

        BookOneToManyBiDirectional book1 = new BookOneToManyBiDirectional();
        BookOneToManyBiDirectional book2 = new BookOneToManyBiDirectional();

        book1.setBookId(1L);
        book1.setBookName("Maths");
        book1.setAuthor(author);

        book2.setBookId(2L);
        book2.setBookName("Science");
        book2.setAuthor(author);

        author.getBooks().add(book1);
        author.getBooks().add(book2);

        authorOneToManyBiDirectionalRepository.save(author);
    }
}