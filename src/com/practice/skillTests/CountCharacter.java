package com.practice.skillTests;

import java.util.HashMap;
import java.util.Map;

public class CountCharacter {
    public static void countChar(String str){
        Map<Character, Integer>map=new HashMap<>();
        char[] s=str.toCharArray();
        for(char c:s){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else {
                map.put(c,1);
            }
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        String string="Rajesj";
        countChar(string);
    }
}
