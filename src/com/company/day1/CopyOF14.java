package com.company.day1;

import java.util.Random;

public class CopyOF14 {
    public static void main(String[] args) {
        Random random=new Random();
int []array=new int[10];
for(int i=0;i<10;i++) {
    array[i] = random.nextInt(10);

    System.out.print(array[i] + " ");
}
        System.out.println();
for(int j=0;j<10;j++)
        {
    System.out.print(copy(array)[j] + " ");
}
    }
    public static int[] copy(int [] array)
    {
        int [] a=new int[10];
        for(int i=0;i<10;i++)
        {
            a[i]=array[i];
        }
    return a;
    }


}
