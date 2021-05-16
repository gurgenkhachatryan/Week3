package com.company.day3;

import java.util.Scanner;

public class CharacterIndex2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int index = scanner.nextInt();

        System.out.print("index=" + index + "  ch=" + Charind(text, index));
    }

    public static char Charind(String str, int index) {
        char ch = str.charAt(index);
        return ch;
    }


}