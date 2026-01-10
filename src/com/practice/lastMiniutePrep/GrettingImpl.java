package com.practice.lastMiniutePrep;

public class GrettingImpl implements  Greeting {

    @Override
    public void sayHello(String name) {
    }
    public static void main(String[] args) {
        Greeting g = (name) -> System.out.println("Hello " + name);
        g.sayHello("Rajesh");

    }
}
