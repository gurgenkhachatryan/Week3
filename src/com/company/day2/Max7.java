package com.company.day2;

import java.util.Scanner;

public class Max7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
int number1= scanner.nextInt();
int number2= scanner.nextInt();
        System.out.println("max(a,b)=" + max(number1,number2));
        int number3= scanner.nextInt();
        System.out.println(("max(a,b,c)=" + max(number1,number2,number3)));
int number4= scanner.nextInt();
        System.out.println("max(a,b,c,d)=" + max(number1,number2,number3,number4));
    }


    public static int max(int a,int b)
    {
        int maximal=(a>b)? a : b;

        return maximal;
    }

    public static int max(int a,int b,int c)
    {
        int maximal=(a>b && a>c)?a:((b>a && b>c)? b :c);

            return maximal;
    }
    public static int max(int a,int b,int c,int d)
    {
int maximal=(a>b && a>c && a>d)?a:((b>a && b>c && b>d)?b:(c>a && c>b && c>d)?c:d);
       return maximal;

    }
}
