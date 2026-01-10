package com.practice.lastMiniutePrep;

import java.util.HashMap;
import java.util.Map;

public class CountOnlyUniqueCharacter {
    public static void main(String[] args) {
        String str="asdffdscecj";
        Map<Character,Integer>map=new HashMap<>();
        for(char ch:str.toCharArray()){
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            }
            else{
                map.put(ch,1);
            }
        }
        for(Map.Entry<Character,Integer>m:map.entrySet()){
            if(m.getValue()==1){
                System.out.println(m.getKey());
            }
        }

    }
}
