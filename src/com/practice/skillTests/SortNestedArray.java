package com.practice.skillTests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortNestedArray {

    public static void sortFruits(Object[] data){
        List<String> fruits=new ArrayList<>();
        int n= data.length;
        for(int i=0;i<n;i++){
            Object data1=data[i];
            if(data1 instanceof String){
                fruits.add(data1.toString());
            } else if (data1 instanceof String[]) {
                String[]arr=(String[]) data1;
                for(int j=0;j<arr.length;j++){
                    fruits.add(arr[j]);
                }
            }
        }
        Collections.sort(fruits);
        System.out.println(fruits);
    }
    public static void main(String[] args) {
        Object[]data={"Apple",new String[]{"Banana","Cherry"},"Orange",new String[]{"Blueberry"},"Cranberry",new String[]{"Grapes"},"Guava"};
        sortFruits(data);
    }
}
