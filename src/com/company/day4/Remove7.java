package com.company.day4;

import java.util.Scanner;

public class Remove7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int i =0;
        System.out.println(notX(name, i));

    }

    public static String notX(String text, int i) {
        String s1 = "";
        char ch=text.charAt(i);
        if(i==(text.length()-1))
            {
                if(ch!='x')
                {return s1+ch;}
                else
                {
                    return s1;
                }
        }
              if (ch != 'x') {
                s1 += ch;
            }
        return s1+notX(text,i+1);
    }
}