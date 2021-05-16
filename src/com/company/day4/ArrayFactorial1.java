package com.company.day4;

import java.util.Scanner;

public class ArrayFactorial1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input factorial number");
        int factNumber = scanner.nextInt();
        System.out.println(factNumber + "!=" + factorial(factNumber));
        int[] mas = {4, 2, 3, 1};
        int i= mas.length-1;
        System.out.println("array sum=" + arrayFun(mas,i));

    }

    public static int arrayFun(int[] array,int i) {
        //int i = array.length - 1;

        if (i == 0) {
            return array[0];
        }
        int sum=array[i] + arrayFun(array,i-1);
        return sum;

    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

}
