package com.practice.problemSolving;

public class MinimumCoinCount {
    public static void main(String[] args) {
        int amount=1893;
        int[] notes={500,100,50,20,10,5,2,1};

        System.out.println("Amount: " + amount);
        System.out.println("Notes breakdown:");

        int totalCount = 0;
        for(int i=0;i<notes.length;i++) {
            if (amount >= notes[i]) {
                int count = amount / notes[i];
                amount = amount % notes[i];
                System.out.println("Note of " + notes[i] + ": " + count);
            }
        }
    }
}
