package com.practice.skillTests;

import java.util.*;

public class CumilativeMultiply {
    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(3,4,5,7);
        int l2=l1.stream().reduce(1,(a,b)->a*b);
        System.out.println(l2);
    }
}
