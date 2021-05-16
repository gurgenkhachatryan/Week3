package com.company.day4;

import java.util.Scanner;

public class xcount6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name= scanner.nextLine();
        System.out.println("text=" + name);
        int i=0;
        System.out.println("count of 'x'=" + charToString(name,i));
    }
    public static int charToString(String text,int i)
    {int count=0;
       // for(int i=0;i<text.length();i++)
        if(i==text.length())
        {
            return count;
        }

            if(text.charAt(i)=='x')
            {
                count++;
            }

        return count+charToString(text,i+1);
    }
}
