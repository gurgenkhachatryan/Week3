package com.company.day3;

import java.util.Scanner;

public class Binarhex11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String  number= scanner.nextLine();
        bin2Dec(number);

    }

    public static void bin2Dec(String tox) {
        double sum = 0;


        int toxlength = tox.length();
        String str = tox.replaceAll("[^01]", "");
        int strlength = str.length();
        if (strlength != tox.length()) {
            System.out.println("invalid number");
        } else {
            for (int i = 0; i <strlength; i++) {
                sum = sum + Integer.parseInt(String.valueOf(str.charAt(i))) * Math.pow(2, strlength-1-i);
            }
            System.out.println("sum=" + sum);
        }
    }
}