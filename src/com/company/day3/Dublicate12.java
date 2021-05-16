package com.company.day3;

import java.util.Scanner;

public class Dublicate12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("dublicate=" + dublicate(text));
    }

    public static int dublicate(String tox) {
        int count = 0;
        for (int i = 0; i < tox.length(); i++) {
            for (int j = 0; j < tox.length(); j++) {
                if (tox.charAt(i) != tox.charAt(j)) {

                } else {
                    if (i != j) {
                        count++;
                //        tox=tox.replaceFirst();
                    }
                    break;
                }
            }
        }
        return count;
    }
}