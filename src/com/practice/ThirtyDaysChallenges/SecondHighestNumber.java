package com.practice.ThirtyDaysChallenges;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestNumber {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(5, 2, 6, 45, 53, 60);
        Optional<Integer> l2 = l1.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(l2);
    }
}
