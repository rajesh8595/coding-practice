package com.practice.skillTests;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountPalindromePair {
        //check to wheather pallindrome
        public static boolean isPalindrome(String s){
        int left =0;
        int right=s.length()-1;
        //compare character
        while(left<right){
            if(s.charAt(left++)!=s.charAt(right--))
                return false;
        }
        return true;
    }

        //count the palindrome pair
        public static int countPamindromePairs(String [] words){
        Set<String> set=new HashSet<>(Arrays.asList(words)); // store all words
        int count=0;
        for(String str:words){
            for(int i=0;i<=str.length();i++){
                String prefix=str.substring(0,i);
                String suffix=str.substring(i);

                //check the reverse of suffix

                if(isPalindrome(prefix)){
                    String rev=new StringBuilder(suffix).reverse().toString();
                    if(set.contains(rev)&&!rev.equals(str))
                        count++;
                }
                if(i!=str.length() && isPalindrome(suffix)){
                    String revPre=new StringBuilder(prefix).reverse().toString();
                    if(set.contains(revPre) && !revPre.equals(str))
                        count++;
                }
            }
        }
        return count;
    }

        public static void main(String[] args) {
        String[]arr={"ab","ac","ba","ca","cba","ab"};
        System.out.println(countPamindromePairs(arr));


    }

}
