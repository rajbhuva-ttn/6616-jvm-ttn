package com.ttn.JPAWithHibernatePart3.OneToManyMapping.BiDirectional.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "author_one_to_many_bidirectional")
public class AuthorOneToManyBiDirectional {
    @Id
    @Column(name = "author_id")
    private Long authorId;

    @Column(name = "author_name")
    private String name;

    @Column(name = "author_email")
    private String email;

    @Column(name = "author_gender")
    private String gender;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "streetNumber", column = @Column(name = "author_street_number")),
            @AttributeOverride(name = "location", column = @Column(name = "author_location")),
            @AttributeOverride(name = "street", column = @Column(name = "author_street"))
    })
    AddressOneToManyBiDirectional address;

   @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BookOneToManyBiDirectional> books = new ArrayList<BookOneToManyBiDirectional>();

    public void addBook(BookOneToManyBiDirectional book){
        books.add(book);
        book.setAuthor(this);
    }

    public void removeBook(BookOneToManyBiDirectional book){
        books.remove(book);
        book.setAuthor(null);
    }


    public List<BookOneToManyBiDirectional> getBooks() {
        return books;
    }

    public void setBooks(List<BookOneToManyBiDirectional> books) {
        this.books = books;
    }

    public AuthorOneToManyBiDirectional(){

    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public AddressOneToManyBiDirectional getAddress() {
        return address;
    }

    public void setAddress(AddressOneToManyBiDirectional address) {
        this.address = address;
    }
}
