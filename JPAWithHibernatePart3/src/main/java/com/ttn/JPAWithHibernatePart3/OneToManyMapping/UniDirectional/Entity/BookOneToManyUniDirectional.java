package com.ttn.JPAWithHibernatePart3.OneToManyMapping.UniDirectional.Entity;

import javax.persistence.*;

@Entity
@Table(name = "book_one_to_many_unidirectional")
public class BookOneToManyUniDirectional {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "book_id")
    private Long bookId;

    @Column(name = "book_name")
    private String bookName;

    public BookOneToManyUniDirectional(){

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
