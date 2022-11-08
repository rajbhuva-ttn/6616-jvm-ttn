package com.ttn.JPAWithHibernatePart3.OneToManyMapping.BiDirectional.Entity;

import javax.persistence.*;

@Entity
@Table(name = "book_one_to_many_bidirectional")
public class BookOneToManyBiDirectional {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "book_id")
    private Long bookId;

    @Column(name = "book_name")
    private String bookName;

    public AuthorOneToManyBiDirectional getAuthor() {
        return author;
    }

    public void setAuthor(AuthorOneToManyBiDirectional author) {
        this.author = author;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    private AuthorOneToManyBiDirectional author;

    public BookOneToManyBiDirectional(){

    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
