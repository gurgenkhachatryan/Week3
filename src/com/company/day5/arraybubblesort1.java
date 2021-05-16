package com.company.day5;

import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;

public class arraybubblesort1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the array size");
        int arrayLength = scanner.nextInt();
        Random random = new Random();
        int[] mas = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            mas[i] =1+ random.nextInt(99);
        }
        printArray(mas);
        System.out.println();
       printArray(bubbleSort(mas));

    }

    public static int[] bubbleSort(int[] array) {
        int mij;
        for (int i = 0; i < array.length -1; i++) {
            for (int j = 0; j < array.length -1-i; j++) {
                if (array[j] > array[j+1]) {
                    mij = array[j];
                    array[j] = array[j+1];
                    array[j+1] = mij;
                }
            }
        }
  return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
