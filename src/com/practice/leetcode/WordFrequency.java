package com.practice.leetcode;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static Map<String, Integer> wordFrequency(String[] words) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        return frequencyMap;
    }

    public static void main(String[] args) {
        String str = "She said she would,and she did,she said.";
        str = str.toLowerCase();
        String[] words = str.split("\\W+");
        Map<String, Integer> frequencyMap = wordFrequency(words);
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            if(entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
