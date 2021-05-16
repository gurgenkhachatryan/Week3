package com.company.day5;

import java.util.Random;
import java.util.Scanner;

public class Guessingindex11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int arraySize=101;
        int [] array=new int[arraySize];
        for(int i=1;i<arraySize;i++)
        {
            array[i]=i;
        }
        System.out.println("is a 1-100 array");
        printArray(array);

      //  text="";
        System.out.println();
        System.out.println("enter high or low");
        binarySearch(array);
    }

    public static void binarySearch(int[]array){
        Scanner scanner=new Scanner(System.in);
        String text=new String("");
        int left=array[0];
        int right=array[array.length-1];
        int leftIndex=0;
        int count=0;
        int rightIndex=array.length-1;
        while(!(text.equals("ok")))
        {
            System.out.println("your number is a " + ((left+right)/2+1) + "?");
            text= scanner.nextLine();
            if(text.equals("high"))

            {count++;
                leftIndex=(leftIndex+rightIndex)/2+1;
                left=(left+right)/2;

            }
            else
            {count++;
                rightIndex=(leftIndex+rightIndex)/2-1;
                right=(left+right)/2;

            }
        }
        System.out.println(((leftIndex+rightIndex)/2) + "count=" + count);

    }


    public  static void printArray(int []array)
    {
        for(int i=1;i< array.length;i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}
