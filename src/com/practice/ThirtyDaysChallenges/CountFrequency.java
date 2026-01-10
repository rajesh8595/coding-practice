package com.practice.ThirtyDaysChallenges;

import java.util.HashMap;
import java.util.Map;
public class CountFrequency {

    public static void countFrequecy(String s){
        Map<Character,Integer>m1=new HashMap<>();
        char[] c=s.toCharArray();
        for(char c1:c){
            if(m1.containsKey(c1)){
                m1.put(c1,m1.get(c1)+1);
            }else {
                m1.put(c1,1);
            }
        }
        System.out.println(m1);
    }

    public static void main(String[] args) {
        String s1="Rajjesnuf";
        countFrequecy(s1);
    }
}
