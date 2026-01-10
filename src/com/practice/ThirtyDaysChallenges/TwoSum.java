package com.practice.ThirtyDaysChallenges;

import java.util.Arrays;

public class TwoSum {
    public static int[] towSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++)
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int arr[]={4,6,8,3};
       int result[]= towSum(arr,9);
       System.out.println("The indexes are"+Arrays.toString(result));

    }
}
