//https://github.com/abanoub-asaad
//For java preactice and problemsolving patway

package com.practice.skillTests;

public class LongestEvenLengthSubStringSum {
   public static int longestEvenLengthSubString(String str) {
        int n=str.length();
        int maxLen=0;

        int[] prefix=new int[n+1];
        prefix[0]=0;
        for(int i=0;i<n;i++){
            prefix[i+1]=prefix[i]+(str.charAt(i));

        }
        for(int len=2;len<=n;len=len+2){ //only even lengths
            for(int k=0;k<=n-len;k++){
                int mid=k+len/2;
                int end=k+len;
                int leftSum=prefix[mid]-prefix[k];
                int rightSum=prefix[end]-prefix[mid];
                if(leftSum==rightSum){
                    maxLen=Math.max(maxLen,len);
                }
            }
        }
        return maxLen;

    }

    public static void main(String[] args) {
        String str="124124";
        System.out.println(longestEvenLengthSubString(str));
    }
}

