package com.company.day3;

import java.util.Scanner;

public class StringCharacter3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text= scanner.nextLine();
        String ch=scanner.nextLine();
        char nish=ch.charAt(0);
        System.out.println(StringChar(text,nish));
    }

    public static boolean StringChar(String str,char tar)
    {
    String    norstr=String.valueOf(tar);
       boolean bool= str.contains(norstr);
       return bool;
    }

}
