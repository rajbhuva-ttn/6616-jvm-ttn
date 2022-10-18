package com.ttn.assignmnet.AllExamples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Main.class, args);
        BinarySearch binarySearch = applicationContext.getBean(BinarySearch.class);
        int result = binarySearch.Searching(Arrays.asList(4,5,6,7,8,1,2,3),3);
        System.out.println(result);
    }
}
