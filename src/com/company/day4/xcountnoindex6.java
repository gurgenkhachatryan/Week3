package com.company.day4;

import java.util.Scanner;

public class xcountnoindex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your text");
        String str = scanner.nextLine();
        System.out.print("x count a text=");
        System.out.println(countx(str));
    }

    public static int countx(String str) {
        int count = 0;
        if (str.length() == 0) {
            return count;
        }
        if (str.charAt(0) == 'x') {
            count++;}
            return count + countx(str.substring(1));
    }
}











/*
    public static int countx(String str)
    {int count=0;
        if(str.length()==0)
        {
            return count;
        }
        if(str.charAt(0)=='x')
        {
            count++;}
            return count+countx(str.substring(1));

    }*/