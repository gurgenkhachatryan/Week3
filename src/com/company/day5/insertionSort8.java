package com.company.day5;

import java.util.Scanner;

public class insertionSort8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter array size");
        int  arraySize = scanner.nextInt();
        int [] array=new int[arraySize];
        System.out.println("enter array element");
        for(int i=0;i<arraySize;i++)
        {
            array[i]= scanner.nextInt();
        }
        printArray(array);
        System.out.println();
        printArray(insertionSearch(array));

    }

    public static int[] insertionSearch(int [] array) {
        int j, k;
        for (int i = 1; i < array.length; i++) {
            k = array[i];
            j = i - 1;
            while (j >= 0 && k < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = k;
        }
        return array;
    }



    public static void printArray(int []array)
    {
        for(int i=0;i< array.length;i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}