package com.practice.ThirtyDaysChallenges;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicates {
    public static void main(String[] args) {
        String str = "Rajessh";

        Map<Character, Integer> m1 = new HashMap<>();
        for (char c1 : str.toCharArray()) {
            if (m1.containsKey(c1)) {
                m1.put(c1, m1.get(c1) + 1);
            } else {
                m1.put(c1, 1);
            }
        }
        //Romove duplicates
        for (Map.Entry<Character, Integer> entry : m1.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
