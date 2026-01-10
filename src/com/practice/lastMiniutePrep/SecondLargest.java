package com.practice.lastMiniutePrep;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargest {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,35,778,543);
        Optional<Integer>p1=list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(p1);
    }
}
