package com.practice.skillTests;

import java.util.Scanner;

public class RverseInteger {
  public static void reverseInteger(int num){
      int rev=0;
      while (num!=0){
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
      }
      System.out.println(rev);
  }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int x=sc.nextInt();
        reverseInteger(x);
        sc.close();
    }
}
