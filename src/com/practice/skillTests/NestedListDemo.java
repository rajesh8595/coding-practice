package com.practice.skillTests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NestedListDemo {
    public static void main(String[] args) {
            List<Object> list= Arrays.asList(1,Arrays.asList(2,3),4,Arrays.asList(5,6,7),8);
            List<Integer>result=new ArrayList<>();
            for(Object obj:list){
                if(obj instanceof Integer){
                    result.add((Integer) obj);
                }else if(obj instanceof List){
                    List<Integer> nestedList=(List<Integer>) obj;
                    result.addAll(nestedList);
                }
            }
            System.out.println(result);
    }
}
