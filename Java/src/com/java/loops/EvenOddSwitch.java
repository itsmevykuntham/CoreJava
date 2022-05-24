package com.java.loops;

import java.util.Scanner;

public class EvenOddSwitch {
    public static void main(String[] args) {
        int n;
        System.out.println("enter a number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        switch (n%2){
            case 0:
                System.out.println(n + " is an Even Number");
                break;

            case 1:
                System.out.println(n + " is an Odd Number");
                break;
        }
    }
}
