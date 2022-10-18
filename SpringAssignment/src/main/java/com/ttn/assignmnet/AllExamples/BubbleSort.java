package com.ttn.assignmnet.AllExamples;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Primary
public class BubbleSort implements Sort {
    @Override
    public void sorting(List<Integer> array) {
        System.out.println("BubbleSort is running.");
    }
}
