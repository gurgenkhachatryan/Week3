package com.company.day1;

import java.util.Random;
import java.util.Scanner;

public class minimum1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int a = random.nextInt(20);
        int b = random.nextInt(20);
        int c = random.nextInt(20);
        int d = random.nextInt(20);
        System.out.println(a + "," + b + "," + c + "," + d);
        int minimalNumber = minimum(a, b, c, d);
        System.out.println("minimalNumber=" + minimalNumber);

    }

    public static int minimum(int a, int b, int c, int d) {

        int min = d;
        if ((a < b) && (a < c) && (a < d)) {
            min = a;
        } else if ((b < a) && (b < c) && (b < d)) {
            min = b;
        } else if ((c < a) && (c < b) && (c < d)) {
            min = c;
        }
        return min;
    }
}
