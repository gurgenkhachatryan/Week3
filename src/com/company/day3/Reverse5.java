package com.company.day3;

import java.util.Scanner;

public class Reverse5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text= scanner.nextLine();
        System.out.println("        text=" + text);
        System.out.println("reverse text=" + reverse(text));
    }

    public static StringBuilder reverse(String str)
    {
        StringBuilder popox=new StringBuilder(str);
        StringBuilder newpopox=popox.reverse();
        return  newpopox;

    }
}
