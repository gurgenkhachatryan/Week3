package com.company.day5;

import java.util.Random;
import java.util.Scanner;

public class arraybubblerecursiv2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int sizearray=1+ random.nextInt(11);
        int[]array=new int[sizearray];
        int n=array.length;
        for(int i=0;i<array.length;i++)
        {
            array[i]=1+random.nextInt(100);
        }
        printArray(array);
        System.out.println();
        printArray(bubbleRecursive(array,n));

    }
    public static int[] bubbleRecursive(int[]array,int n)
    {

        if(n==1)
        {
            return array;
        }
        for(int i=0;i< array.length-1;i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        return bubbleRecursive(array,n-1);
    }
    public static void printArray(int []array)
    {
        for(int i=0;i< array.length;i++)
        {
            System.out.print(array[i] + " ");
        }
    }

    }



