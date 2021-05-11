package com.company.day1;

import java.util.Random;
import java.util.Scanner;

public class Arrayandnumber12 {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        int number=3+ random.nextInt(10);
        int []a={1,2,3,4,5};
        System.out.println("number=" +number);
        System.out.println(arraynumber(a,number));
}
    public static boolean arraynumber(int[]array,int n)
    {boolean flag=false;
        for(int i=0;i< array.length-1;i++)
        {
            if(array[i]==n)
            {flag=true;
                return flag;
            }
        }
        return flag;
    }
}
