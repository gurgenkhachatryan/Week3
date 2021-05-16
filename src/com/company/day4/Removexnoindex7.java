package com.company.day4;
import java.util.Scanner;

public class Removexnoindex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your text");
        String text = scanner.nextLine();
        System.out.println("your text remove x");
        System.out.println(remove(text));

    }

    public static String remove(String text) {
        if(text.length()==0)
        {
            return text;
        }
        if(text.charAt(0)=='x')
        {
            return remove(text.substring(1));
        }
        else
            return text.charAt(0)+remove(text.substring(1));
    }

    }
