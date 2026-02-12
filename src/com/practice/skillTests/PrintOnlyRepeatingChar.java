package com.practice.skillTests;

public class PrintOnlyRepeatingChar {
    public static void main(String[] args) {
        String str = "hello madam";
        printRepeatingChars(str);
    }
    public static void printRepeatingChars(String str) {
        int[] charCount = new int[256]; // Assuming ASCII character set

        for (char c : str.toCharArray()) {
            charCount[c]++;
        }
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {
                System.out.println((char) i );
            }
        }
    }
}
