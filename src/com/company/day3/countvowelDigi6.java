package com.company.day3;

import java.util.Scanner;

public class countvowelDigi6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text= scanner.nextLine();
        count(text);
    }
    public static void count(String str)
    {
String newstr=str.toUpperCase();
int allLength=newstr.length();
String vowel=newstr.replaceAll("[^A,E,I,O,U]","");
      //  System.out.println("vowel=" + vowel);
int vowelLength=vowel.length();
        System.out.println("vowelLength=" + vowelLength);
String number=newstr.replaceAll("[^0-9]","");
      //  System.out.println("numberLength=" + number);
int intnumber=number.length();
        System.out.println("numberLangth=" + intnumber);
    //    System.out.println(intnumber);
        double doublevowellength=vowelLength;
        double doubleintnumber=intnumber;
        double doublealllength=allLength;
double tokosVowel=(doublevowellength/doublealllength)*100;
double tokosnumber=(doubleintnumber/doublealllength)*100;
       System.out.println("tokosVowel=" + tokosVowel);
      System.out.println("tokosnumber=" + tokosnumber);
    }
}
