package com.company.day3;

import java.util.Scanner;

public class Cesar7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text= scanner.nextLine();
        System.out.println(Caesars(text));
    }

    public static StringBuilder Caesars(String str)
    {
String tox=str.toUpperCase();
int number=0;int number2=0;
StringBuilder nortox = new StringBuilder("");

      for(int i=0;i<tox.length();i++)
       {
           number = tox.charAt(i)+3;
           if(number>87)
           {
               number=number-26;
           }
           char ch = (char)number;
           nortox.append(ch);
      }

        return  nortox;
    }
}
