package com.ttn.JPAWithHibernatePart3.ManyToManyMapping.Entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "book_many_to_many")
public class BookManyToMany {

    @Id
    @Column(name = "book_id")
    private Long book_id;

    @Column(name = "book_name")
    private String book_name;

    @ManyToMany(mappedBy = "books", cascade = {CascadeType.ALL})
    private Set<AuthorManyToMany> authors = new HashSet<AuthorManyToMany>();

    public Long getBook_id() {
        return book_id;
    }

    public void setBook_id(Long book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public Set<AuthorManyToMany> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<AuthorManyToMany> authors) {
        this.authors = authors;
    }
}
