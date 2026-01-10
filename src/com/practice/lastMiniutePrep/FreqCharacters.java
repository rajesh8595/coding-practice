package com.practice.lastMiniutePrep;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FreqCharacters {
    public static void main(String[] args) {
        String s1="abcabcdae";
        Map<Character,Long>freq=s1.chars().mapToObj(c->(char)c).collect(Collectors.
                groupingBy(Function.identity(),Collectors.counting()));

        freq.forEach((x,y)->{
            System.out.println(x+" "+y);
        });
    }
}



