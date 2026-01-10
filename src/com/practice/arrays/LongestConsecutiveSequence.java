package com.practice.arrays;

import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Use a HashSet for O(1) lookup time
        HashSet<Integer> set = new HashSet<>();

        // Add all numbers to the set
        for (int num : nums) {
            set.add(num);
        }

        int longestStreak = 0;

        // Iterate through the numbers to find the longest streak
        for (int num : set) {
            // Check if it's the beginning of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Keep checking for consecutive numbers
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                // Update the longest streak
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest consecutive sequence length: " + longestConsecutive(nums));  // Output: 4
    }
}

