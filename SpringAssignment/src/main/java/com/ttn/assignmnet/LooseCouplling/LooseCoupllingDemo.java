package com.ttn.assignmnet.LooseCouplling;

import javax.swing.text.Position;
import java.util.Arrays;

public class LooseCoupllingDemo {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch(new QuickSort());
        int result = binarySearch.Searching(Arrays.asList(5,4,8,1,2,3),3);
        System.out.println(result);
    }


}
