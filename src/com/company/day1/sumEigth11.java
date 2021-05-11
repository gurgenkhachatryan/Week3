package com.company.day1;

import java.util.Scanner;

public class sumEigth11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
int number=0;int gum=0;
        while (number!=-1)
        {
            number= scanner.nextInt();
             gum=gum+eigth(number);
        }
        System.out.println("gum=" + gum);

    }
    public static int eigth(int n)
    {int ntiv=n;int sum=0;
        while(n!=0)
        {
            if(n%10!=8)
            {
                n/=10;
            }
            else
            {
                sum+=ntiv;
                return sum;
            }
        }
        return sum;
    }

}
