package com.company.day2;

import java.util.Scanner;

public class Fahrenheit9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int celsius= scanner.nextInt();
        float celsiusf= scanner.nextFloat();
        System.out.print("float->int=" + fahrenheitCelsius(celsiusf));
        System.out.println();
        System.out.println("int ->double=" + fahrenheitCelsius(celsius));
    }
    public static int fahrenheitCelsius(float cels)
    {
float fahren=(cels*9/5)+32;
int intfahren=(int)fahren;
return intfahren;
    }
    public static double fahrenheitCelsius(int cels)
    {
double fahren=(cels*9/5)+32;
return fahren;
    }
}
