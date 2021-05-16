package com.company.day4;

import java.util.Scanner;

public class max12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your text number");
        String text= scanner.nextLine();
        System.out.print("max=");
        System.out.println(max(text));

    }
public static String max(String text)
{
    if(text.length()==1)
        return text;
    if(text.charAt(0)<text.charAt(1))
        return max(text.substring(1));
    else
        return max(text.substring(2)+text.charAt(0));

}
}
