package com.java.loops;

import java.util.Scanner;

public class Armstrong {
    static boolean isArmstrong(int n){
        int temp, digits = 0, last = 0, sum=0;

        temp = n;
        while(temp > 0){
            temp = temp/10;
            digits++;
        }
        temp = n;
        while (temp>0){
            last = temp%10;
            sum+=(Math.pow(last, digits));

            temp = temp/10;
        }
        if(n==sum){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        // 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748,  92727, 93084, 548834, 1741725, 4210818, 9800817, 9926315
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(isArmstrong(num)){
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }

    }
}