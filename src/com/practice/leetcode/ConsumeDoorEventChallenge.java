package com.practice.leetcode;

import java.util.Scanner;

public class ConsumeDoorEventChallenge {
    public static String consumeDoorEvents(String events) {
        StringBuilder result = new StringBuilder();
        int posistion=0;
        int direction=0;
        for(char event:events.toCharArray()){
            if(event=='O'){
                if(direction==0){
                    direction=(posistion==0)?1:-1;
                }else{
                    direction*=-1;
                }
            }else if(event=='P'){
                if(direction==0){
                    direction=(posistion==0)?1:-1;
                }else{
                    direction=0;
                }
            }
            posistion+=direction;
            if(posistion>5){
                posistion=5;
                direction=0;
            }else if(posistion<0){
                posistion=0;
                direction=0;
            }
            result.append(posistion);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the events");
        String events = scanner.nextLine();
        System.out.println(consumeDoorEvents(events));
    }
}
