package com.company.day1;

import java.util.Random;
import java.util.Scanner;

public class arrayindex13 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];
        System.out.print("a[i]=");
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int findNumber = 1 + random.nextInt(10);
        System.out.println("findNumber=" + findNumber);
        System.out.println(arrayindex(a, findNumber));

    }

    public static int arrayindex(int[] array, int n) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == n) {
                return i;
            }
        }
        return -1;
    }
}
