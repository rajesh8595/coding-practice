package com.practice.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FIndDuplicate {
    public static void main(String[] args) {
   /*     int a[]={23,4,3,23,2,5,7,5};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j])
                    System.out.println(a[j]);
            }
        }
        System.out.println();
    }*/
        List<Integer> b = Arrays.asList(3, 4, 5, 3, 6, 8, 5);
        Set<Integer> b1 = b.stream().filter(i -> Collections.frequency(b, i) > 1).collect(Collectors.toSet());
        System.out.println(b1);
    }
}
