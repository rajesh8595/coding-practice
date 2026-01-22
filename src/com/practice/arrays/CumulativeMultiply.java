package com.practice.arrays;

import java.util.Arrays;
import java.util.List;

public class CumulativeMultiply {
    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(1,2,3,4,5);
        int res=1;
        res=l1.stream().reduce(1,(a,b)->a*b);
        System.out.println(res);
    }
}
