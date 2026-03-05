package com.practice.skillTests;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccoutMerge {
    public static List<List<String>> accountMerge(List<List<String>>acconut) {
        Map<String, String> parent = new HashMap<>();
        Map<String, String> emailsToName = new HashMap<>();

        for (List<String> ac : acconut) {
            String name = ac.get(0);
            for (int i = 1; i < ac.size(); i++) {
                String email = ac.get(i);
                parent.putIfAbsent(email, email);
                emailsToName.put(email, name);
                union(parent, ac.get(1), email);
            }

        }
        Map<String, List<String>> mergedAccounts = new HashMap<>();
        for (String email : parent.keySet()) {
            String rootEmail = find(parent, email);
            mergedAccounts.computeIfAbsent(rootEmail, k -> new java.util.ArrayList<>()).add(email);
        }
         List<List<String>> result = new java.util.ArrayList<>();
        for (Map.Entry<String, List<String>> entry : mergedAccounts.entrySet()) {
            String name = emailsToName.get(entry.getKey());
            List<String> emails = entry.getValue();
            emails.sort(String::compareTo);
            List<String> account = new java.util.ArrayList<>();
            account.add(name);
            account.addAll(emails);
            result.add(account);
        }
        return result;
    }
    private static String find(Map<String,String> parent,String email){
        if(!parent.get(email).equals(email)){
            parent.put(email,find(parent,parent.get(email)));
        }
        return parent.get(email);
    }
    private static void union(Map<String,String> parent,String email1,String email2){
        String parent1=find(parent,email1);
        String parent2=find(parent,email2);
        if(!parent1.equals(parent2)){
            parent.put(parent1,parent2);
        }
    }

    public static void main(String[] args) {
        List<String> list1 = List.of("John", "one@gmail.com", "two@gmail.com", "@three@gmail.com");
        List<String> list2 = List.of("John", "one@gmail.com", "four@gmail.com");
        List<String> list3 = List.of("Mary", "five@gmail.com", "six@gmail.com");
        List<String> list4 = List.of("John", "seven@gmail.com");
        List<List<String>> accounts = List.of(list1, list2, list3, list4);
        List<List<String>> mergedAccounts = accountMerge(accounts);
        for (List<String> account : mergedAccounts) {
            System.out.println(account);
        }
    }

}
