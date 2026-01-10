package com.practice.ThirtyDaysChallenges;

public class StackOverFlowError {
    public static void recursiveMethod(){
        recursiveMethod();
    }

    public static void main(String[] args) {
        recursiveMethod();
    }
}
