package com.java.loops;

public class OddEven {
    public static void main(String[] args) {
        for (int i = 1; i<=10;i++){
            if(i%2 ==1){
                System.out.println(i + " Odd Number");
            }
            else if(i%2==0){
                System.out.println(i + " Even Number");
            }
        }
    }
}
