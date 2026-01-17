package com.practice.collection;


import java.util.ArrayList;
import java.util.List;

public class EmpliyeeDemo {
    int id;
    String name;
    int age;
    public EmpliyeeDemo(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }

    public static void main(String[] args) {
        List<EmpliyeeDemo> list=new ArrayList<>();
        list.add(new EmpliyeeDemo(1,"Rajesh",23));
        list.add(new EmpliyeeDemo(2,"Ankita",22));
        list.add(new EmpliyeeDemo(3,"Mudit",25));
        list.add(new EmpliyeeDemo(4,"Murali",23));
        list.add(new EmpliyeeDemo(5,"Pandey",23));
        for(EmpliyeeDemo e:list){
            System.out.println(e.id+" "+e.name+" "+e.age);
        }
    }
}
