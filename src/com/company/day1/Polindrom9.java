package com.company.day1;

import java.util.Scanner;

public class Polindrom9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number= scanner.nextInt();
        System.out.println(Polindrom(number));
    }
    public static boolean Polindrom(int n)
    {int length=0;int nn=n;
        while(n!=0)
        {
            n/=10;
            length++;
        }
        int [] array=new int[length];
        for(int i=0;i<length;i++)
        {
            int tiv=nn%10;
            nn/=10;
            array[length-i-1]=tiv;
        }
        for(int i=0;i<length/2;i++)
        {
            if(array[i]!=array[length-i-1])
            {
                return false;
            }
           /* else
            {
                return true;
            }*/
        }
            return  true;
    }
}
