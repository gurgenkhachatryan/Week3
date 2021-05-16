package com.company.day5;

import java.nio.channels.SelectableChannel;
import java.util.Random;
import java.util.Scanner;

public class selectionsort6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int arraySize=3+ random.nextInt(1);
        int []array=new int[arraySize];
        for(int i=0;i<arraySize;i++)
        {
            array[i]=random.nextInt(100);
        }
        System.out.println("is a random array");
        printArray(array);
        System.out.println();
        printArray(selectionSort(array));
        System.out.println();
        System.out.println("array min element =" + array[0]);
        System.out.println("array max element =" + array[arraySize-1]);
        System.out.println("average=" + average(array));
    }
    public static int[] selectionSort(int []array)
    {int temp=0;
      for(int j=0;j< array.length;j++)
      {
          for(int i=1+j;i< array.length;i++)
          {
              if(array[j]>array[i])
              {   temp=array[j];
              array[j]=array[i];
              array[i]=temp;}
          }
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
    public static int average(int []array)
    {int sum=0;
        for(int i=0;i< array.length;i++)
        {

            sum=sum+array[i];
        }
        int average=sum/ array.length;
        return average;
    }

}
