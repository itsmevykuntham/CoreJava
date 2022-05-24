package com.java.operators;

public class SmallerLarger {
    public static void main(String[] args) {
        int a = 15;
        int b = 10;

        // smaller larger using ternary operators
        int min = (a<b)?a:b;
        int max = (a>b)?a:b;
        System.out.println("Smaller number is : "+min);
        System.out.println("Larger number is : "+max);

        // smaller larger using if else statements
        if(a>b){
            System.out.println("Larger number is "+a);
        }else {
            System.out.println("Smaller number is "+a);
        }
        if(b>a){
            System.out.println("Larger number is "+b);
        }else {
            System.out.println("Smaller number is "+b);
        }
    }
}
