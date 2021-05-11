package com.company.day2;

import java.util.Random;
import java.util.Scanner;

public class ArrayIndex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("arraylength=" + search(array));
        System.out.println();
        int n= scanner.nextInt();
        System.out.println(n +" nshani index=" + search(array,n));
        int index= scanner.nextInt();
        System.out.println(search(array,n,index));

    }

    public static int search(int[] array)
    {
int length=array.length;
return length;
    }

    public static int search(int [] array,int n)
    {
for(int i=0;i<array.length;i++)
{
    if(array[i]==n) {
        return i;
    }
}
        return -1;
    }

    public static boolean search(int []array,int n,int index)
    {
boolean flag=false;
for(int i=0;i<array.length;i++)
{
    if((index==i) && (array[i]==n))
    {
        flag=true;
        return flag;
    }

}
        return flag;
    }

}
