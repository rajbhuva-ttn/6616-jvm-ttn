package com.ttn.RestFulWebService.staticdynamicfiltering.service;

import com.ttn.RestFulWebService.staticdynamicfiltering.entity.Student;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class StudentServiceImpl implements StudentService{
    private static int idGenerator;
    private static HashMap<Integer, Student> hashMap = new HashMap<>();

//    static{
//        hashMap.put(++idGenerator,new Student(idGenerator,"Raj","rajbhuva@gmail.com","12345"));
//    }
    public Student addNewStudent(Student student){
        idGenerator +=1;
        student.setStudentId(idGenerator);
        hashMap.put(idGenerator, student);
        return student;
    }
    public HashMap getAllStudents(){
        return hashMap;
    }


    public Student getStudentById(int studentId){
        Student student = (Student) getAllStudents().get(studentId);
        return student;
    }
}
