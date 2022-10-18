package com.ttn.assignmnet.AllExamples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class BinarySearch {
    @Autowired
    Sort sort;

    //Constructor injecton
    public BinarySearch(Sort sort) {
        this.sort = sort;
    }

    //    //Setter methode for the spring injection
//    public void setSort(Sort sort) {
//        this.sort = sort;
//    }
    public int Searching(List<Integer> array,int number) {
        sort.sorting(array);
        // Logic to search number with binary search
        return 3;
    }
}
