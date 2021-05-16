package com.company.day4;

import java.util.Scanner;

public class Singlenoindex10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String tox= scanner.nextLine();
        System.out.print(endX(tox));
    }
    public static String endX(String name)
    {
        if(name.charAt(0)=='x')
        {
            return name.substring(1)+'x';
        }
        return name.substring(1)+endX(name.substring(1));
    }
}
