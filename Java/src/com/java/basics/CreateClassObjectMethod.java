package com.java.basics;

public class CreateClassObjectMethod {
    void myMethod(){
        String a = "This is a method";
        System.out.println(a);
    }
    public static void main(String[] args) {
        CreateClassObjectMethod obj = new CreateClassObjectMethod();
        obj.myMethod();
    }
}
