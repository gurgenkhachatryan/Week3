package com.company.day5;

import java.util.Random;
import java.util.Scanner;

public class Bineryserch9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int arraySize= 2+random.nextInt(10);
        int [] array=new int[arraySize];
        for(int i=0;i<arraySize;i++)
        {
            array[i]=random.nextInt(100);
        }
        System.out.println("is a random array");
        printArray(array);
        System.out.println();
        System.out.println("is a selection sort array");
        printArray(selection(array));
        System.out.println();
        System.out.println("enter your number output a number index");
        int number= scanner.nextInt();
        System.out.print("index=" + binarySearch(selection(array),number));

    }
    public static int[] selection(int[] array)
    {int temp;
        for(int i=0;i<array.length;i++)
        {
            for(int j=1+i;j< array.length;j++)
            {
              if(array[i]>array[j])
              {
                  temp=array[i];
                  array[i]=array[j];
                  array[j]=temp;
              }
            }
        }
        return array;
    }

    public static int binarySearch(int[]array,int tiv){
int left=array[0];
int right=array[array.length-1];
int leftIndex=0;
int rightIndex=array.length-1;
while(tiv!=array[(leftIndex+rightIndex)/2])
{
if(tiv>array[(leftIndex+rightIndex)/2])
{
    leftIndex=(leftIndex+rightIndex)/2+1;
left=(left+right)/2;

}
else
{rightIndex=(leftIndex+rightIndex)/2-1;
 right=(left+right)/2;

}
}
return (leftIndex+rightIndex)/2;

    }


    public  static void printArray(int []array)
    {
        for(int i=0;i< array.length;i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}
