package com.company.day4;

import java.util.Scanner;

public class Prim11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        double i = 2;
        prim(number, i);
    }

    public static void prim(int n, double i) {
        if (i > Math.sqrt(n)) {
            return;
        }

        if (n % i == 0) {
            System.out.println("No prim number");
            return;
        }
        int k = (int) Math.sqrt(n);
        if (i == k)
            System.out.println("Prim");
        prim(n, ++i);

    }
}



