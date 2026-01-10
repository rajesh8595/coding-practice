package com.practice.lastMiniutePrep;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMapExmp {
    public static void main(String[] args) {
        List<String> str= List.of("Rajesssh","Ankita");
        List<Integer>str2=str.stream().map(String::length).collect(Collectors.toList());
        System.out.println(str2);
        List<List<String>> str3=List.of(
                List.of("Rajesh", "Nayak"),
                List.of("Mudit"),
                List.of("Murali", "Pandey")
        );
        List<String>str4=str3.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(str4);
    }


}
