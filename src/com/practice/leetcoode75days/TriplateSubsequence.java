/*
Day-08

Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.
Example 1:
Input: nums = [1,2,3,4,5]
Output: true
Explanation: Any triplet where i < j < k is valid.

Example 2:
Input: nums = [5,4,3,2,1]
Output: false
Explanation: No triplet exists*/

package com.practice.leetcoode75days;

public class TriplateSubsequence {
    public static boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num;  // smallest so far
            } else if (num <= second) {
                second = num; // second smallest
            } else {
                // num > first and num > second
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {5, 4, 3, 2, 1};

        System.out.println(increasingTriplet(nums1)); // true
        System.out.println(increasingTriplet(nums2)); // false
    }
}
