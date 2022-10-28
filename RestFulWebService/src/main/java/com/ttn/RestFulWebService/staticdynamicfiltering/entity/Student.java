package com.ttn.RestFulWebService.staticdynamicfiltering.entity;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

@Getter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Setter

//@JsonFilter("myBean")
public class Student {
    private int studentId;
    private String studentName;
    private String studentEmail;
//    @JsonIgnore
    private String studentPassword;

    public Student(int studentId, String studentName, String studentEmail, String studentPassword) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.studentPassword = studentPassword;
    }
}
