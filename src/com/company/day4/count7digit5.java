package com.company.day4;

import java.util.Scanner;

public class count7digit5 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number= scanner.nextInt();
        System.out.println("number=" + number);
        System.out.println("7 count=" + seven(number));
    }

    public static int seven(int n) {
        int count = 0;
        if (n== 0) {
            return count;}
        else
            if (n % 10 == 7) {
                count++;
                 }

        return count+seven(n/10);
    }
}
