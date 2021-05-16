package com.company.day3;

import java.util.Locale;
import java.util.Scanner;

public class vowel4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text= scanner.nextLine();
        System.out.println("dcount=" + vowel(text));
        System.out.println("bax qanak=" + vowel(text,1));
    }
    public static int vowel(String str)
    {
        String newStr=str.toUpperCase();
        char ch;int dcount=0;
        for(int i=0;i<newStr.length();i++)
        {
            if((newStr.charAt(i)=='A')||(newStr.charAt(i)=='U')||(newStr.charAt(i)=='E')||(newStr.charAt(i)=='I')||(newStr.charAt(i)=='O'))
                dcount++;
        }
        return dcount;
    }
    public static int vowel(String tox,int n)
    {
        String s=tox.replaceAll("[^a-zA-Z]","");
        int qanak=s.length()-vowel(tox);
        return qanak;
    }

}
