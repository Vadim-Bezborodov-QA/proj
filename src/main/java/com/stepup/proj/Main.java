package com.stepup.proj;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(1);
        System.out.println(2);
        System.out.println("------");
        doSomething();
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        Cat cat = new Cat("b", 2);
    }

    public static void doSomething() {
        System.out.println("do something");
    }

}