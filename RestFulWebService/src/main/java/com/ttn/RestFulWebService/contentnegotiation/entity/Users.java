package com.ttn.RestFulWebService.contentnegotiation.entity;

public class Users {
    private int id;
    private String name;
    private int idCounter = 0;
    public Users(String name) {
        this.id = ++idCounter;
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
