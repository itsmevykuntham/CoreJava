package com.java.basics;

public class LocalGlobalVariables {
    int a = 11; // instance variable it is declared inside the class out side the body
    void localVariable(){
        int a = 22;
        System.out.println(a);
    }

    public static void main(String[] args) {
        LocalGlobalVariables obj = new LocalGlobalVariables();
        System.out.println(obj.a);
        obj.localVariable();

    }
}
