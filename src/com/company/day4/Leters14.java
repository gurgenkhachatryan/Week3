package com.company.day4;

import java.util.Scanner;

public class Leters14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your text");
        String text= scanner.nextLine();
        System.out.println("your new text");
        System.out.println(letters(text));

    }

    public static String letters(String text)
    {
        if(text.length()==1)
        {
            return text;
        }
        //if((text.charAt(0)>65 && text.charAt(0)<90)||(text.charAt(0)>97&&text.charAt(0)<122))
        else
        {
            return text.charAt(0)+"*" + letters(text.substring(1));
        }

    }
}
