package com.company.day5;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Guessing11 {
    public static void main(String[] args) {
        System.out.println("remember something in 1-100");
          BinarySearch();
    }

    public static void BinarySearch() {
        int left = 0;
        int right = 100;
        int numberOfSteps = 0;
        Scanner scanner = new Scanner(System.in);
        String answer = new String();
        System.out.println("please low or high");
        System.out.println(" ok the number was found");
        while (!(answer.equals("ok"))) {
            System.out.println("your number is a  " + ((left + right) / 2 + 1) + " ?");
                answer = scanner.nextLine();
        //    if (  (!(answer.equals("high"))) || (!(answer.equals("low")))) {
          //      System.out.println("print valid text");
         //   } else {
                if (answer.equals("high")) {
                    left = (left + right) / 2;
                    numberOfSteps++;
                } else {
                    numberOfSteps++;
                    right = (left + right) / 2;
                }
            }
            System.out.println("numberOfSteps=" + numberOfSteps);
        }

    }
//}
