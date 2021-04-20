package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int [] myIntegers = new int[4];
        int[] returnedIntegers= readIntegers(myIntegers);
        int returnedMin = findMin(returnedIntegers);
        System.out.println("The min value of array is " + returnedMin);

    }

    public static int[] readIntegers(int [] count){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array of " + count.length + " numbers");
        for (int i=0; i<count.length; i++){
              count[i] = scanner.nextInt();
        }
        System.out.println("The entered numbers are");
        for (int i=0; i<count.length; i++) {
            System.out.print(count[i] + " ");
        }
        return count;
    }

    public static int findMin(int[]array){
        System.out.println();
        int min =Integer.MAX_VALUE;
           for (int i=0; i<array.length; i++){
            int value=array[i];
            if (value<min){
                min=value;
            }
        }
        return min;
    }
}
