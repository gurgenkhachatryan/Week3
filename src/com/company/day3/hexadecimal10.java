package com.company.day3;

import java.util.Scanner;

public class hexadecimal10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text= scanner.nextLine();
        System.out.println(hexadecimal(text));
    }

    public static boolean hexadecimal(String tox)
    {
        //String nortox
        String newTox=tox.replaceAll("[^0-9a-fA-F]","");
if(tox.equals(newTox))
{
    return true;
}
else
{
    return  false;
}
    }
}
