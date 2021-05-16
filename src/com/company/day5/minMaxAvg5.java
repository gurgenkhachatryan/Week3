package com.company.day5;

import java.util.Random;

public class minMaxAvg5 {
    public static void main(String[] args) {
        Random random=new Random();
        int arraySize= 3+random.nextInt(10);
        int[] array=new int[arraySize];
        for(int i=0;i<arraySize;i++)
        {
            array[i]=random.nextInt(100);
        }
        System.out.println("random array");
        printArray(array);
        System.out.println();
        System.out.println("sort array");
        printArray(bubbleSort(array));
        System.out.println();
        int min=array[0];int max=array[arraySize-1];
        System.out.println("array min element =" + min);
        System.out.println("array max element =" + max);
        int avg=(min+max)/2;
        find(array,avg);
    }
    public static int[] bubbleSort(int []array) {
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1 - j; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return array;
    }
    public static int find(int[]array,int avg)
    {
        for(int i=0;i< array.length;i++)
        {
            if(avg==array[i])
            {
                System.out.println("average number and it is in this index " + i);
                return i;
            }
        }
        System.out.println("do not average index");
        return -1;
    }

    public static void printArray(int[]array)
    {
        for(int i=0;i< array.length;i++)
            System.out.print(array[i] + " ");
    }

}
