package com.company.day4;

import java.util.Scanner;

public class Singl10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("your string text");
        String text= scanner.nextLine();
        System.out.println("remove text");
        System.out.print(remove(text));
    }
    public static String remove(String text)
    {

        if(text.length()==1)
        {
            return text;
        }
        if(text.charAt(0)==text.charAt(1))

        { return remove(text.substring(1));}
        else
        {   return text.charAt(0)+remove(text.substring(1));}

    }
}
