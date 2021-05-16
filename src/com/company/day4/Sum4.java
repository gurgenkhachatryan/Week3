package com.company.day4;

import java.util.Scanner;

public class Sum4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("number=" + number);
        System.out.println("sum=" + sum(number));
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }


}

