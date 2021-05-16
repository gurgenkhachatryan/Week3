package com.company.day4;

import java.util.Scanner;

public class countnumbers13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your string number and English letters");
        String text = scanner.nextLine();
        System.out.println("output  count only numbers");
        System.out.println(countNumber(text));
    }

    public static int countNumber(String text) {
        int count = 0;
        if (text.length() == 0) {
            return count;
        }

        if ((int) text.charAt(0) < 48 || (int) text.charAt(0) > 57) {
            countNumber(text.substring(1));
        } else
            count++;
        return count + countNumber(text.substring(1));


    }
}