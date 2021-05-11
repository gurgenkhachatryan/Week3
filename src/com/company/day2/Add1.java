package com.company.day2;

import java.util.Scanner;

public class Add1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int number1= scanner.nextInt();
        int number2= scanner.nextInt();
        int number3= scanner.nextInt();
        System.out.println("add(int a,int b)");
        System.out.println(add(number1,number2));
        System.out.println("add(int a,int b,int c)");
        System.out.println(add(number1,number2,number3));

    }
    public static int add(int a,int b)
    {
        int sum=0;
        sum=a+b;
        return sum;
    }

    public static int add(int a,int b,int c)
    {
int sum=0;sum=a+b+c;
return sum;
    }

}
