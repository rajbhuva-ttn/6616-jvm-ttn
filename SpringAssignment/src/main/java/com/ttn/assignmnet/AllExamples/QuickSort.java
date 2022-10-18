package com.ttn.assignmnet.AllExamples;

import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class QuickSort implements Sort {

    @Override
    public void sorting(List<Integer> array) {
        System.out.println("QuickSort is running");
    }
}
