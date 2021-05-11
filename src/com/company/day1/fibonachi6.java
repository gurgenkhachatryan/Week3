package com.company.day1;

import java.util.Scanner;

public class fibonachi6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number= scanner.nextInt();
        int tiv=fib(number);
        System.out.println("tiv=" + tiv);

    }
    public static int fib(int n)
    {
      int  fibon1=0,fibon2=1,fibonn=fibon1+fibon2;
      for(int i=2;i<n;i++)
      {
          fibon1=fibon2;
          fibon2=fibonn;
          fibonn=fibon1+fibon2;
      }
      return fibonn;
    }
}
