package com.company.day3;

import java.util.Scanner;

public class firstNonRepeat13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("text=" + text);
        System.out.print("firstNonRepeat= ");
        firstNonRepeat(text);

    }
    public static void firstNonRepeat(String text) {
        //  boolean flag = false;
        int i = 0;
        for (i = 0; i < text.length(); i++) {
            int k = 0;
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    k++;
                }
            }
            if (k == 1) {
                // return text.charAt(i);
                System.out.println(text.charAt(i));
                break;
            }
        }
        // return text.charAt(i);
    }

}


