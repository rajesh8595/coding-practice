package com.practice.skillTests;

public class LongestPallindrome {
    public static void main(String[] args) {
        String s="cadabaadaadaabcdasa";
        String longestPallindrome="";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String subStr=s.substring(i,j);
                if(isPallindrome(subStr) && subStr.length()>longestPallindrome.length()){
                    longestPallindrome=subStr;
                }
            }
        }
        System.out.println(longestPallindrome);
    }

    private static boolean isPallindrome(String str) {
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
