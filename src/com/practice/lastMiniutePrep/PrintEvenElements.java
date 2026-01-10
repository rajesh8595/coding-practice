package com.practice.lastMiniutePrep;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintEvenElements {
    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(4,6,5,3,2);

        List<Integer>l2=l1.stream().filter(n->n%2==0).sorted().collect(Collectors.toList());
        System.out.println(l2);
    }

}
