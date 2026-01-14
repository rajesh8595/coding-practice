package com.practice.lastMiniutePrep;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.*;

public class FirstRepeatedWord {
    public static void main(String[] args) {
        String str="I am rajesh rajesh nayak nayak";
        Map<String,Long>wordCount= Arrays.stream(str.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
       wordCount.entrySet().stream().filter(x->x.getValue()>1)
               .findFirst().ifPresent(x->System.out.println(x.getKey()+" = "+x.getValue()));
    }
}
