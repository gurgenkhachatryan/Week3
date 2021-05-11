package com.company.day1;

import java.util.Scanner;

public class isVowel8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nish = scanner.nextLine();
        System.out.println(vowel(nish));
    }

    public static boolean vowel(String str) {
        char ch = str.charAt(0);
        if (ch == 'A' || ch == 'a' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u' || ch == 'I' || ch == 'i' || ch == 'E' || ch == 'e') {
            return true;
        } else {
            return false;
        }
    }
}