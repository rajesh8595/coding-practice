package com.practice.ThirtyDaysChallenges;

public class DuplicatesInString {
    public static void main(String[] args) {
        String s="Raaajeesh";
        char[] c=s.toCharArray();
        for(int i=0;i<s.length();i++){
            for(int j=0;j<i;j++){
                if(c[i]==c[j]){
                    System.out.println(c[j]);
                }
            }
        }

    }
}
