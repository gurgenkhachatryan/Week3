package com.company.day1;

import java.util.Random;

public class TrueFalse3 {
    public static void main(String[] args) {
        Random random=new Random();
        int number1= random.nextInt(2);
        int number2= random.nextInt(2);
        System.out.println("number1=" + number1);
        System.out.println("number2=" + number2);
        boolean number11 = number1==0?false:true;
        boolean number22 = number2==0?false:true;
        System.out.println(xor(number11,number22));
    }

    public static boolean xor(boolean a, boolean b) {

        if (a && b || !a&&!b) {
            return false;}
        else 
            {return true;}
    }
}
