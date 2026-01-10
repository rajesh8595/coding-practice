package com.practice.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class PrintSecondLargest {
    public static void main(String[] args) {
        List<Integer>l1= Arrays.asList(34,45,32,2,5);
        Optional<Integer>p=l1.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(p);
    }
}
