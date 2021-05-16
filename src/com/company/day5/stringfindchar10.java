package com.company.day5;

import java.util.Scanner;

public class stringfindchar10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter string size");
        int stringSize= scanner.nextInt();
        String [] text=new String[stringSize];
        System.out.println("print string element");
        for(int i=0;i<stringSize;i++)
        {
            text[i]= scanner.nextLine();
        }
        printString(text);
        System.out.println();
        printString(sortChar(text));
        System.out.println();
        String[] str=new String[1];
        System.out.println("input char element");
        str[0]= scanner.nextLine();
        System.out.println();
        findChar(text,str);


    }

public static String[] sortChar(String[] text) {
    for (int i = 0; i < text.length; i++) {
        for (int j = 1 + i; j < text.length; j++) {
            if (text[i].compareTo(text[j]) > 0) {
                String temp = text[i];
                text[i] = text[j];
                text[j] = temp;
            }
        }
    }
    return text;
}
public static void findChar(String[]text,String[] ch)
{
    for(int i=0;i< text.length;i++)
    {
        if(text[i].compareTo(ch[0])==0)
        {
            System.out.println("index=" + i);
        }

}
}


    public static void printString(String[]text)
    {
        for(int i=0;i< text.length;i++)
        {
            System.out.print(text[i]+" ");
        }
    }
}
