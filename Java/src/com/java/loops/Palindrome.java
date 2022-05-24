package com.java.loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), r,s=0;
        int temp = n;
        while(n>0){
            r = n % 10;
            n = n / 10;
            s = s * 10 + r;
        }
        if(temp == s){
            System.out.println("is palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
