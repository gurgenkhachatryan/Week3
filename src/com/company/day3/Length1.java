package com.company.day3;

import java.util.Scanner;

public class Length1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text= scanner.nextLine();
        System.out.println("length=" + Length(text));
    }
    public static int Length(String str){
        int length=str.length();
        return length;
    }
}
