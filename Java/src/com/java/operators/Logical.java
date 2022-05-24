package com.java.operators;

public class Logical {
    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        int c = 5;

        // Logical AND (&&)
        System.out.println(a>b && a>c);
        System.out.println(a<b && a<c);
        System.out.println(a>b && a<c);

        // Logical OR (||)
        System.out.println(a>b || a>c);
        System.out.println(a<b || a<c);
        System.out.println(a>b || a<c);

        // Logical NOT (!)
        System.out.println(!(a>b));
        System.out.println(!(a<b));
    }
}
