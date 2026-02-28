package com.practice.leetcode;

public class SmallestBinaryString {
    public static String getSmallestString(String dataSequesnce, int maxSwaps){
        char[]arr=dataSequesnce.toCharArray();
        int n=arr.length;
        for(int i=0;i<n && maxSwaps>0; i++){
            if(arr[i]=='0'){
                int j=i;
                while(j>0 && arr[j-1]=='1' && maxSwaps>0){
                    arr[j]='1';
                    arr[j-1]='0';
                    j--;
                    maxSwaps--;
                }
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String str="11011010";
        int maxSwap=5;
        System.out.println(getSmallestString(str,maxSwap));
    }
}
