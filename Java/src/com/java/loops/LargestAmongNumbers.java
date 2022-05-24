package com.java.loops;

import java.util.Scanner;

public class LargestAmongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b = sc.nextInt();
        System.out.println("Enter Third Number : ");
        int c = sc.nextInt();

        if((a>b)&&(a>c)){
            System.out.println("The Largest Number is : "+a);
        }
        else if((b>a)&&(b>c)){
            System.out.println("The Largest Number is : "+b);
        }
        else {
            System.out.println("The Largest Number is : "+c);
        }

    }
}
