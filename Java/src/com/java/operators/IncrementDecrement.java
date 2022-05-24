package com.java.operators;

public class IncrementDecrement {

    static void preIncrement(int a , int b){
        int d;
        d = b + (++a);
        System.out.println("values after pre-increment a,b : " + a + "," + d);
    }
    static void postIncrement(int a , int b){
        int d;
        d = b + (a++);
        System.out.println("values after post-increment a,b : " + a + "," + d);
    }
    static void preDecrement(int a , int b){
        int d;
        d = b + (--a);
        System.out.println("values after pre-decrement a,b : " + a + "," + d);
    }
    static void postDecrement(int a , int b){
        int d;
        d = b + (a--);
        System.out.println("values after post-decrement a,b : " + a + "," + d);
    }


    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        preIncrement(a,b);
        postIncrement(a,b);
        preDecrement(a,b);
        postDecrement(a,b);

    }
}
