package com.company.day1;

import java.util.Scanner;

public class PolindromString9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String poli= scanner.nextLine();
        System.out.println(palindrome(poli));
    }

    public static boolean palindrome(String str)
    {boolean flag=false;
        for(int i=0;i<str.length()/2;i++)
        {
            if(str.charAt(i)==(str.charAt(str.length()-i-1)))
            {
                flag=true;
            }
     /*       else
            {
                flag=false;
            }*/
        }
        return flag;
    }
}
