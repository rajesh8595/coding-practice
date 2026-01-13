package com.practice.epamProblemSolving;

import java.util.ArrayList;
import java.util.List;

//Check if a number is perfect
public class PerfectNumer {
    public static List<Integer> perfectNumbers(int limit) {
        List<Integer>result=new ArrayList<>();
        for(int num=2;num<=limit;num++){
            int sum=0;
            for(int i=1;i<num;i++){
                if(num%i==0){
                    sum+=i;
                }
            }
            if(sum==num){
                result.add(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(perfectNumbers(1000));
    }
}
