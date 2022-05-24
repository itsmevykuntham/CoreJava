package com.java.operators;

public class Arithmetic {

    static void addition(int a, int b){
        int add = a + b;
        System.out.println(add);
    }
    static void subtraction(int a, int b){
        int sub = a - b;
        System.out.println(sub);
    }
    static void multiplication(int a, int b){
        int mul = a * b;
        System.out.println(mul);
    }
    static void division(int a, int b){
        int div = a / b;
        System.out.println(div);
    }

    public static void main(String[] args) {
        int a = 10, b = 5;

        addition(a,b);
        subtraction(a,b);
        multiplication(a,b);
        division(a,b);

    }
}
