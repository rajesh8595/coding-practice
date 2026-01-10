package com.practice.ThirtyDaysChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountrySelector {
    public static List<String> getPixiries(List<String> available, List<String> special) {
        List<String> result = new ArrayList<>();
        for (String specialCountry : special) {
            if (available.contains(specialCountry)) {
                result.add(specialCountry);
            }
        }
        for (String country : available) {
            if (!result.contains(country)) {
                result.add(country);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> availableCountries= Arrays.asList("United States","Mexico","Canada","Coast Rica","Bermuda","Belgium");
        List<String> specialCountries=Arrays.asList("Canada","Mexico","France","Belgium");
        List<String> result=getPixiries(availableCountries,specialCountries);
        System.out.println(result);
    }
}

