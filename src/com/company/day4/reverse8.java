package com.company.day4;

import java.util.Scanner;

public class reverse8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        int i=text.length()-1;
         System.out.println(reverse(text,i));
    }

    public static String  reverse(String n,int i) {
        String nor = new String();
        char ch=n.charAt(i);
        if(i==0)
        {
            return (nor+ch);
        }
                    ch = n.charAt(i);
            nor = nor + ch;
            return nor+reverse(n,i-1);
        }

    }