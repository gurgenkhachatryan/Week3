package com.company.day1;

import java.util.Scanner;

public class Atothepowerofn2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(power(a, n));


    }

    public static double power(double a, int n) {
        double sum = 1;
        for (int i = 0; i < n; i++) {
            sum = sum * a;
        }
        return sum;
    }
}
