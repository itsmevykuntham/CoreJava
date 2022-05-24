package com.java.arrays;

public class AverageArray {
    static int arrSum(int[] arr){
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        float avg = arrSum(arr)/arr.length;
        System.out.println(avg);
    }
}
