package com.company.day5;

import java.util.Scanner;

public class betweenTree12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter size array");
        int sizeOfArray= scanner.nextInt();
        System.out.println("enter your array ");
        int []array=new int[sizeOfArray];
        for(int i=0;i<array.length;i++)
        {
            array[i]= scanner.nextInt();
        }
        printArray(array);
        System.out.println();
        printArray(sortTree(array));

    }

public static int[] sortTree(int []array)
{int temp;
    for(int i=0;i< array.length;i++)
    {
        for(int j=1+i;j< array.length;j++)
        {
            if((array[i]>array[j])&&(array[i]>0)&&(array[j]>0))
            {
                temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }
    }
    return array;
}

    public static void printArray(int[]array)
    {
        for(int i=0;i< array.length;i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}
