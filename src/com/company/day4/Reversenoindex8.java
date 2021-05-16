package com.company.day4;

import java.util.Scanner;

public class Reversenoindex8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your text");
        String text= scanner.nextLine();
        System.out.println("your reverse text");
        System.out.println(revers(text));

    }
    public static String revers(String text)
    {
        if(text.length()==0)
        {
            return text;
        }
        return text.charAt(text.length()-1)+revers(text.substring(0,text.length()-1));

    }
}
