package com.company.day1;

import java.util.Scanner;

public class Student15 {
    public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);
        System.out.println("student count");
     int stCount= scanner.nextInt();
     //int bal=scanner.nextInt();
     int []array=new int[stCount];
     for(int i=0;i<stCount;i++)
     {int bal=scanner.nextInt();
         array[i]=bal;
     }
        System.out.println("metaverage=" + metAverage(array));
        System.out.println("minimum=" + minimum(array));
        System.out.println("maximum=" + maximum(array));
    }
    public static double metAverage(int []aver)
    {int average=0;
        for(int i=0;i<aver.length;i++)

        {
             average=average+aver[i];
        }
        return average/3;
    }

    public static int minimum(int []aver)
    {
        int min=100;
        for(int i=0;i<aver.length;i++)
        {
            if(min>aver[i])
            {
                min=aver[i];
            }
        }
        return min;

    }

    public static int maximum(int []aver)
    {
        int max=0;
        for(int i=0;i<aver.length;i++)
        {
            if(max<aver[i])
            {
                max=aver[i];
            }
        }
        return max;
    }


}
