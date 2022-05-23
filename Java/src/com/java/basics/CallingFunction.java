package com.java.basics;

public class CallingFunction {
    static void myMethod(){
        String name = "Ravi Kumar Vykuntham";
        System.out.println(name);
    }
    public static void main(String[] args) {
        CallingFunction obj = new CallingFunction();
        obj.myMethod();
    }
}
