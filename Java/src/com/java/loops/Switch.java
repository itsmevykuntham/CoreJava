package com.java.loops;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Enter the gender : ");
        Scanner sc = new Scanner(System.in);
        char gender = sc.next().charAt(0);

        switch (gender){
            case 'M':
                System.out.println("Gender is Male");
                break;
            case 'F':
                System.out.println("Gender is Female");
                break;
            default:
                System.out.println("Gender is incorrect");
        }
    }
}
