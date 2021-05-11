package com.company.day1;

import java.util.Scanner;

public class Threeboolean4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean flag1= scanner.nextBoolean();
        boolean flag2= scanner.nextBoolean();
        boolean flag3= scanner.nextBoolean();

        System.out.println(election(flag1,flag2,flag3));
    }
    public static boolean election(boolean x,boolean y,boolean z)
    {
        int truecount=0,falsecount=0;
        if(x==true)
        {
            truecount++;
        }
        else
        {
            falsecount++;
        }
        if(y==true)
        {
            truecount++;
        }
        else
        {
            falsecount++;
        }
        if(z==true)
        {
            truecount++;
        }
        else
        {
            falsecount++;
        }
if(truecount>falsecount)
{
    return  true;
}
else
{
    return false;
}
    }
}
