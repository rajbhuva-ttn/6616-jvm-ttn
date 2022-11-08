package com.ttn.JPAWithHibernatePart3.OneToManyMapping.UniDirectional.Entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "author_one_to_many_unidirectional")
public class AuthorOneToManyUniDirectional {

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
    AddressOneToManyUniDirectional address;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "author_id")
    private Set<BookOneToManyUniDirectional> books = new HashSet<BookOneToManyUniDirectional>();

    public AuthorOneToManyUniDirectional(){

    }

    public Set<BookOneToManyUniDirectional> getBooks() {
        return books;
    }

    public void setBooks(Set<BookOneToManyUniDirectional> books) {
        this.books = books;
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

    public AddressOneToManyUniDirectional getAddress() {
        return address;
    }

    public void setAddress(AddressOneToManyUniDirectional address) {
        this.address = address;
    }
}
