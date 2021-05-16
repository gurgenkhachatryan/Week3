package com.company.day5;

import java.util.Scanner;

public class StrArrayBubbleRecursive4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your string size");
        int stringSize = scanner.nextInt();
        String[] text = new String[stringSize];
        System.out.println("enter your string  " + text.length + "element");
        for (int i = 0; i < text.length; i++) {
            text[i] = scanner.nextLine();
        }
        printString(text);
        int n = text.length;
        System.out.println();
        printString(bubbleSortRecursive(text,n));
    }

    public static String[] bubbleSortRecursive(String[] text, int n) {
        if (n == 1) {
            return text;
        }
        for (int i = 0; i < text.length-1; i++) {
            if (text[i].compareTo(text[i + 1])>0) {
                String temp = text[i];
                text[i] = text[i + 1];
                text[i + 1] = temp;
            }
        }
        return bubbleSortRecursive(text, n - 1);
    }

        public static void printString(String[]text)
        {
            for (int i = 0; i < text.length; i++) {
                System.out.print(text[i] + " ");
            }
        }

    }
