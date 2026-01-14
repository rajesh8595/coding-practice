package com.practice.lastMiniutePrep;

public class SecondLargestNum {
    public static void main(String[] args) {
        int arr[]={12,35,1,10,34,40};
        int secondLargest=0;
        int largest=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }else if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest=arr[i];
            }
        }
        System.out.println(secondLargest);
    }
}
