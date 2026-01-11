package com.practice.epamProblemSolving;

import java.util.HashSet;
import java.util.Set;

//Find the length of longest substring without duplicate character
public class LongestSubstring {
    public static int lenghOfLongestSubstring(String s){
        Set<Character> set=new HashSet<>();
        int left=0, maxlenn=0;
        for(int right=0; right<s.length();right++){
            while (set.contains(s.charAt(right))){
                set.remove((s.charAt(left)));
                left++;
            }
            set.add(s.charAt(right));
            maxlenn=Math.max(maxlenn,right-left+1);
        }
        return maxlenn;
    }
    public static void main(String[] args) {
        String str="abcabcbb";
        System.out.println(lenghOfLongestSubstring(str));
    }
}
// write the approach: