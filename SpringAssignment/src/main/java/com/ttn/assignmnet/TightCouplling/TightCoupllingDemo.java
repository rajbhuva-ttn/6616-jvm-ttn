package com.ttn.assignmnet.TightCouplling;

import java.util.Arrays;

public class TightCoupllingDemo {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int result = binarySearch.Searching(Arrays.asList(4,6,8,1,2,3),3);
        System.out.println(result);
    }
}
