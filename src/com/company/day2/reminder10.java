package com.company.day2;

import java.util.Scanner;

public class reminder10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number1= scanner.nextInt();
        int number2= scanner.nextInt();
        System.out.println(reminder(number1));
        System.out.println(reminder(number1,number2));

    }
    public static int reminder(int n)
    {int sum=0;
        while(n!=0)
        {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }

    public static int reminder(int n,int k)
    {
        int sum=0;
        while(n!=0)
        {
            sum+=n%10;
            n/=10;
        }
        return sum%k;

    }

}
