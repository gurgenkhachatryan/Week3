package com.company.day4;

import java.util.Random;
import java.util.Scanner;

public class Binerysearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int left = 0;
        int right = 100;
        System.out.println("please input high or low to start the game");

        String pat = scanner.nextLine();

        while ((pat.equals("high"))||(pat.equals("low"))) {
            harccompic(left,right);
           pat = scanner.nextLine();
            if (pat.equals("high")) {
                left = (left + right) / 2;
            } else {
                if (pat.equals("low"))
                right = (left + right) / 2;

            }
        }
    }

    public static void harccompic(int left, int right) {
        System.out.println( (left + right) / 2);

    }
}
