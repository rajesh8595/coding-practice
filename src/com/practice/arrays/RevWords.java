package com.practice.arrays;

public class RevWords {
    public static void revWords(String s){
        String [] s1=s.split(" ");
        for(int i=s1.length-1;i>=0;i--){
            System.out.print(s1[i]+" ");
        }
    }
    public static void main(String[] args) {
        String s="HELLO WORLD";
        revWords(s);
    }
}
