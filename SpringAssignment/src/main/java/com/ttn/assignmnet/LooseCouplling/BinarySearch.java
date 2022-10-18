package com.ttn.assignmnet.LooseCouplling;

import java.util.List;

public class BinarySearch {
    Sort sort;

    public BinarySearch(Sort sort) {
        this.sort = sort;
    }

    public int Searching(List<Integer> array,int number) {
        sort.sorting(array);
        // Logic to search number with binary search
        return 3;
    }
}
