package com.company.day3;

import java.util.Scanner;

public class Chek9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String number= scanner.nextLine();
        System.out.println(chekbinstr(number));
    }

    public static boolean chekbinstr(String n)
    {
        int firstLength=n.length();
        String norn=n.replaceAll("[^0,1]","");
        if(firstLength==norn.length())
        {
            return true;
        }
        else
        {
            return  false;
        }
    }

}
