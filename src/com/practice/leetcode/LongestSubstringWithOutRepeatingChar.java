package com.practice.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithOutRepeatingChar {

    public static String longestSubstringWithoutRepeat(String s) {
        if (s == null || s.isEmpty()) return "";

        int maxLen = 0, maxStart = 0;
        int left = 0;
        Map<Character, Integer> lastIndex = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if (lastIndex.containsKey(c)) {
                left = Math.max(left, lastIndex.get(c) + 1);
            }

            lastIndex.put(c, right);

            if (right - left + 1 > maxLen) {
                maxLen = right - left + 1;
                maxStart = left;
            }
        }

        return s.substring(maxStart, maxStart + maxLen);
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longestSubstringWithoutRepeat(s));
    }
}
