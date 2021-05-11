package com.company.day1;

import java.util.Scanner;

public class hasEigth10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(has(number));
    }

    public static boolean has(int n) {
        boolean flag = true;
        while (n != 0) {
            if (n % 10 == 8) {
                return flag;
            }
            n /= 10;
        }
        flag = false;
        return flag;
    }

}
