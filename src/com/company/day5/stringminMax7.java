package com.company.day5;

import java.util.Scanner;

public class stringminMax7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter stringSize");
        int stringSize= scanner.nextInt();
        String[] text=new String[stringSize];
        System.out.println("enter element");
        for(int i=0;i<stringSize;i++)
        {
            text[i]= scanner.nextLine();
        }
        printString(text);
        System.out.println();
        printString(selectionSort(text));
        String min=text[1];
        String max=text[text.length-1];
        System.out.println("min=" + min);
        System.out.println("max=" + max);

    }
    public static String[] selectionSort(String[]text)
    {
        for(int i=0;i< text.length;i++)
        {
            for(int j=1+i;j< text.length;j++)
            {
                if(text[i].compareTo(text[j])>0)
                {
                    String temp=text[j];
                    text[j]=text[i];
                    text[i]=temp;
                }
            }
        }
        return text;
    }



    public  static void printString(String[]text)
    {
        for(int i=0;i<text.length;i++)
        {
            System.out.print(text[i] + " ");
        }
    }
}
