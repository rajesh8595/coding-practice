package com.practice.ThirtyDaysChallenges;

public class MaximumSubArray {

    // Function to find the maximum subarray sum using Kadane's algorithm
    public static int maxSubArray(int[] nums) {
        // Initialize variables to keep track of the maximum sum
        // currentMax is the maximum sum subarray that ends at the current index
        // globalMax is the overall maximum sum found so far
        int currentMax = nums[0];
        int globalMax = nums[0];

        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Update currentMax to either the current element or the sum of currentMax and current element
            currentMax = Math.max(nums[i], currentMax + nums[i]);

            // Update globalMax if currentMax is larger
            globalMax = Math.max(globalMax, currentMax);
        }

        return globalMax;
    }

    public static void main(String[] args) {
        // Example input array
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        // Find and print the maximum subarray sum
        System.out.println("Maximum Subarray Sum: " + maxSubArray(nums));
    }
}
