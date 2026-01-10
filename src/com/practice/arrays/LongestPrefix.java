package com.practice.arrays;

public class LongestPrefix {
    public static String longestPrefix(String [] str){
        int l=str.length;

        if(l==0)
            return "";
        String prefix=str[0];
    for(int i=0;i<l;i++){
        while (str[i].indexOf(prefix)!=0){
            prefix=prefix.substring(0,prefix.length()-1);
            if(prefix.isEmpty())
                return "";
        }
    }
        return prefix;
    }

    public static void main(String[] args) {
        String[]s1={"Flower","Flo","Flight"};
        System.out.println(longestPrefix(s1));
    }
}
