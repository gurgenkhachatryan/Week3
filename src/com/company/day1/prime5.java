package com.company.day1;

import java.util.Scanner;

public class prime5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 0 || number > 20000000) {
            System.out.println("input valid number");
        }
        System.out.println(isPrime(number));
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return true;
            }

        }
        return false;
    }
}
