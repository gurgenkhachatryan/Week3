package com.company.day4;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class TriangleCount3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input line triangle");
        int lineCount= scanner.nextInt();
        System.out.println("triangle count=" + triangle(lineCount));
        triangle(lineCount);
    }
public static int triangle(int tox)
{
    if(tox==0)
    {
        return 0;
    }
    return tox+triangle(tox-1);
}
}
