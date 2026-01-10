package com.practice.ThirtyDaysChallenges;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharJava8 {
    public static Character findFirstNonRepeatingChar(String input) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Count character occurrences
        input.chars()
                .mapToObj(c -> (char) c)
                .forEach(c -> charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1));

        // Find the first character with count 1
        return charCountMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
    }

    public static void main(String[] args) {
        String input = "swiss";
        Character result = findFirstNonRepeatingChar(input);
        System.out.println("First non-repeating character: " + result);
    }
}
