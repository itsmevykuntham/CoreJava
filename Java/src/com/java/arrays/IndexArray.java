package com.java.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class IndexArray {
    static void arrIndex(int[] arr, int n){
        for(int i = 0; i<arr.length; i++){
            if(n == arr[i]){
                System.out.println(n + " is at index "+ i);
                return;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int index;

        System.out.println("Arr = " + Arrays.toString(arr));

        System.out.println("Select any value to find index of array : ");
        Scanner sc = new Scanner(System.in);
        index = sc.nextByte();
        arrIndex(arr, index);
    }
}
