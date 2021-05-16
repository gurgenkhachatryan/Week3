package com.company.day4;

import java.util.Scanner;

public class EndX9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int i = 0;
        System.out.println(notX(name, i));

    }

    public static String notX(String text, int i) {
        String sx = "";
        String sarx = "";
        char ch = text.charAt(i);
        if (i == text.length() - 1) {
            if (ch == 'x') {
                return sarx + sx + ch;
            } else {
                return sarx + ch + sx;
            }
        }
        if (ch != 'x') {
            sarx += ch;
        } else {
            sx = sx + ch;
        }
        return sarx + notX(text, i + 1) + sx;
    }
}



