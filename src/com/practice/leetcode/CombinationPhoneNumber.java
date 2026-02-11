package com.practice.leetcode;

/*Letter Combinations of a Phone Number*/
public class CombinationPhoneNumber {
    public static void main(String[] args) {
        String digits = "23";
        String[] mapping = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        StringBuilder sb = new StringBuilder();
        backtrack(digits, mapping, sb, 0);
    }

    private static void backtrack(String digits, String[] mapping, StringBuilder sb, int index) {
        if (index == digits.length()) {
            System.out.println(sb.toString());
            return;
        }
        String letters = mapping[digits.charAt(index) - '0'];
        for (char letter : letters.toCharArray()) {
            sb.append(letter);
            backtrack(digits, mapping, sb, index + 1);
            sb.deleteCharAt(sb.length() - 1); // Backtrack
        }
    }
}
