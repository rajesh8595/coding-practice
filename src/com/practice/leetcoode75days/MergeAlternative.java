//Day 1
/*Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  abc
word2:  pqr
merged: a p b q c r

Example 2:
Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  ab
word2:  pqrs
merged: a p b q r s

*/


package com.practice.leetcoode75days;

public class MergeAlternative {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int i=0;
        while (i<word1.length()||i<word2.length()){
            if(i<word1.length()){
                sb.append(word1.charAt(i));
            }
            if(i<word2.length()){
                sb.append(word2.charAt(i));
            }
            i++;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str1="abc";
        String str2="pqr";
        System.out.println(mergeAlternately(str1,str2));
    }
}
