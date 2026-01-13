package com.practice.epamProblemSolving;
// Runing Sum of 1d Array
import java.util.ArrayList;
import java.util.List;

public class RunningSum {
    public static List<Integer> runningSum(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            result.add(sum);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> result = runningSum(new int[]{1, 2, 3, 4});
        System.out.println(result);
    }
}
