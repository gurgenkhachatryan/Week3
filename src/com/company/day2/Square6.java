package com.company.day2;

import java.util.Scanner;

public class Square6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
int radius= scanner.nextInt();
float side= scanner.nextFloat();
int number1= scanner.nextInt();
int number2= scanner.nextInt();
        System.out.println(square(radius));
        System.out.println(square(side));
        System.out.println(square(number1,number2));
    }


    public static double square(int radius)
    {
        double squarecirqle=Math.PI*radius*radius;
        return squarecirqle;
    }
    public static double square(float side)
    {
        double squareSquare=side*side;
        return squareSquare;
    }
    public  static double square(int a,int b)
    {
        double squareRectangle=a*b;
return squareRectangle;
    }
}
