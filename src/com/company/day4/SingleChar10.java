package com.company.day4;

import java.util.Scanner;

public class SingleChar10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int i = 0;
        System.out.println("arkrk=" + Clean(text, i));
    }

    public static String Clean(String name, int i) {
        String arkrk = "";
        if (i == name.length() - 1) {
            return arkrk + name.charAt(i);
        } else if (name.charAt(i) != name.charAt(i + 1)) {
            arkrk += name.charAt(i);
        }

        return arkrk + Clean(name, i + 1);

    }
}
