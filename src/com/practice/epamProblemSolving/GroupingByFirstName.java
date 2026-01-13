package com.practice.epamProblemSolving;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//List of Strings names by first character
public class GroupingByFirstName {
    public static void main(String[] args) {
        List<String> names = List.of("apple", "banana", "apricot", "cherry", "buleberry");
        Map<Character, List<String>> map = names.stream().collect(Collectors.groupingBy(name -> name.charAt(0)));
        System.out.println(map);
    }
}
