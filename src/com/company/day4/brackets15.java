package com.company.day4;

import java.util.Scanner;

public class brackets15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your text");
        String text = scanner.nextLine();
        System.out.println("your new text");
        System.out.println(brackets(text));
    }

    public static String brackets(String text) { //int n=text.length();
        if (text.length() == 0)
            return text;
        else {
            text=text.substring(0,text.length()/2);
            return text.charAt(0)+"("+brackets(text.substring(1));

           //  text.charAt(text.length()/2) + ")" + brackets(text.substring(1,3));
        }
     //   if (text.length() == 1)

     //   {  return text.charAt(0) + ")" + brackets(text.substring(1));}


    }
}