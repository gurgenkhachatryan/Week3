package com.company.day2;

import java.util.Scanner;

public class Floatint2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number1= scanner.nextInt();
        int number2=scanner.nextInt();
        System.out.println("int->float");
        System.out.println(in(number1,number2));
        System.out.println("int->int");
        System.out.println(in(number1,number2));

    }
    public static int  in(int a,int b)
    {
        int sum;
        sum=a+b;
        return sum;
    }
    public  static float in(int a,float b)
    {
        float sum;
        sum=a+b;
        return sum;
    }
}
