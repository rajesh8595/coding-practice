package com.practice.epamProblemSolving;

import java.util.Arrays;

//FInd the second largest number in an array
public class SecondLargest {
    public static int secondLargest(int []arr){
        int first=0;
        int second=0;
        for(int num:arr){
            if(num>first){
                second=first;
                first=num;
            }else if(num>second && num!=first){
                second=num;
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int arr[]={33,45,65,22,55,39};
        System.out.println(Arrays.toString(new int[]{secondLargest(arr)}));
    }
}
