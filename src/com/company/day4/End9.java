package com.company.day4;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class End9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Str= ");
        String text= scanner.nextLine();
        System.out.println(endX(text));
    }
    public static String endX(String name)
    {
        if(name.length()==1)
        {
            return name;
        }
        if(name.charAt(0)=='x')
        {
            return endX(name.substring(1))+'x';
        }
        return name.charAt(0)+endX(name.substring(1));
    }
}
