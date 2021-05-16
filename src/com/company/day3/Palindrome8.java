package com.company.day3;

import java.util.Scanner;

public class Palindrome8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text= scanner.nextLine();
        System.out.println(emordnilap(text));
    }

public static boolean emordnilap(String str)
{boolean flag=false;
    StringBuilder pop=new StringBuilder(str);
    StringBuilder newpop=pop.reverse();
    if(str.equals(newpop.toString()))
    {
        flag=true;

    }
    return  flag;
}

}
