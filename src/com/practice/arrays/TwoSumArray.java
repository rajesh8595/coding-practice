package com.practice.arrays;

import java.util.Arrays;

public class TwoSumArray {
    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 4, 61, 34, 12 };
        int result[] = twoSum(arr, 46);
        System.out.println("The indexes are " + Arrays.toString(result));
    }
}
