package com.company.day5;

import java.util.Scanner;

public class StringArrayBubbleSort3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your String size");
        int StringSize= scanner.nextInt();
        String[] text = new String[StringSize];
      //  String [] text = {"g","f","e","d","c","b","a"};
        System.out.println("your text in " + StringSize + " word");
        for(int i=0;i<text.length;i++)
        {
            text[i]= scanner.nextLine();
        }
          printString(text);
        System.out.println();
        System.out.println("bubble sort text");
     printString(sort(text));
    }

    public static String[] sort(String[] text) {
        for (int i = 0; i < text.length - 1; i++) {
            for (int j = 0; j < text.length - 1 - i; j++) {
                if (text[j].compareTo(text[j + 1]) > 0) {
                    String temp = text[j];
                   text[j]=text[j+1];
                   text[j+1]=temp;
                }
            }
        }

       return text;
    }

    public static void printString(String[] text )
    {
        for(int i=0;i< text.length;i++)
        {
            System.out.print(text[i] + " ");
        }
    }
}
