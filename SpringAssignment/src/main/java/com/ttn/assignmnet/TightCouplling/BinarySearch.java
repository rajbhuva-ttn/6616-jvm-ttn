package com.ttn.assignmnet.TightCouplling;

import java.util.List;

public class BinarySearch {
    BubbleSort bubbleSort = new BubbleSort();
    public int Searching(List<Integer> array, int number) {
        bubbleSort.sort(array);
        // Logic to search number in array by binary search
        return number;
    }
}
