package com.company.day3;

import java.util.Scanner;

public class Count14 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text= scanner.nextLine();
        String nish= scanner.nextLine();
        char n=nish.charAt(0);
        System.out.println(count(text,n));

    }

    public static int count(String str,char n)
    {
        int count = 0;
        int num=n;
        for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) ==n) {
count++;
                }
                    }

        return count;
            }
        }

