package com.practice.problemSolving;

public class CumulativeSum {
    public static void cumulativeSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            arr[i] = sum;
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,6,10};
        cumulativeSum(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
