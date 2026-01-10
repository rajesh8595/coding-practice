package com.practice.ThirtyDaysChallenges;

public class SortingDemo {
    public static void sortArray(int[] arr)
    {
        int n=arr.length;
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int ar[]={2,5,4,61,34,12};
        sortArray(ar);
    }
}
