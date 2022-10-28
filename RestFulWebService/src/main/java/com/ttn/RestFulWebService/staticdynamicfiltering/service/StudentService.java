package com.ttn.RestFulWebService.staticdynamicfiltering.service;


import com.ttn.RestFulWebService.staticdynamicfiltering.entity.Student;

import java.util.HashMap;

public interface StudentService {
    public HashMap getAllStudents();
    public Student addNewStudent(Student student);
    public Student getStudentById(int studentId);
}
