package com.practice.lastMiniutePrep;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUpperCase {
    public static void main(String[] args) {
        List<String>l1= Arrays.asList("rajesh","ankita");
        List<String>l2=l1.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(l2);
    }
}
