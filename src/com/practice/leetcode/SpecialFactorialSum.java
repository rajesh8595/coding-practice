package com.practice.leetcode;

import java.util.Scanner;

public class SpecialFactorialSum {

    static boolean isPrime(int n){
        if(n < 2) return false;
        for(int i=2; i*i <= n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    public static int factorialSum(int[] arr){
        int[] fact = new int[10];
        fact[0] = 1;
        for(int i = 1; i <= 9; i++){
            fact[i] = fact[i-1] * i;
        }

        int count = 0;

        for(int num : arr){
            int temp = num;
            int sum = 0;

            while(temp > 0){
                sum += fact[temp % 10];
                temp /= 10;
            }

            System.out.println("Number: " + num + ", Factorial Sum: " + sum + ", Is Prime: " + isPrime(sum));

            if(isPrime(sum)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array length:");

        int arr_length = scan.nextInt();
        int[] arr = new int[arr_length];

        System.out.println("Enter array elements:");
        for(int j = 0; j < arr_length; j++){
            arr[j] = scan.nextInt();
        }

        int result = factorialSum(arr);
        System.out.println("Result: " + result);
    }
}
