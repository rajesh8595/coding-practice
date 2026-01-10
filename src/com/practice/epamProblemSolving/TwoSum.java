package com.practice.epamProblemSolving;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Given an array and a target, retrun indices of two numbers whose sum equals to target.

// Loop through the array and for each element
// calculate the difference between the target and the element
// If the difference is already in the map, return the indices
// Otherwise, add the element and its index to the map
public class TwoSum {
    public static int[] twoSum(int [] nums, int target){
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i]; //1st-7,2nd-6,3rd-5;
            if(map.containsKey(diff)){
                return  new int[]{map.get(diff),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[]arr={2,5,4,3,6};
        int target=9;
        System.out.println("The indices are "+Arrays.toString(twoSum(arr, target)));
    }
}
