package com.practice.ThirtyDaysChallenges;

public class ReverseString {
    public static void stringReverse(String s){
        int n=s.length();
        String s1="";
        for(int i=n-1;i>=0;i--) {
            s1 = s1 + s.charAt(i);
        }
        System.out.println(s1);
    }

    public static void main(String[] args) {
        String s2="Rajesh";
        stringReverse(s2);
    }
}
