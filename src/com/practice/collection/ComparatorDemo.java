package com.practice.collection;

//Example of Comparator
public class ComparatorDemo {

    public static void main(String[] args) {
        String[] names = {"Rajesh", "Ankita", "Mudit", "Murali", "Pandey"};
        java.util.Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
        for (String name : names) {
            System.out.println(name);
        }
    }
}
