package com.ttn.RestAPI;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class Employee {
    private int id;
    @Size(min=3,message = "minimum 3 character required!!")
    private String name;
    @Min(value = 18, message = "minimum 18 years required!!")
    private int age;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

}
