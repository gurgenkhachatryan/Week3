package com.company.day2;

public class Array4 {
    public static void main(String[] args) {
int [] masInt={1,2,3};
float []masFloat={1.1f,2.2f,3.3f};
double []masDab={1.1d,2.2d,3.3d};
print(masInt);
        System.out.println();
print(masFloat);
        System.out.println();
print(masDab);

    }
    public static void print(int [] array)
    {
        System.out.print("[");
        for(int i=0;i< array.length;i++)
        {if(i== array.length-1)
        {
            System.out.print(array[i]);
        }else
            System.out.print(array[i] + ",");

        }
        System.out.print("]");
         }
    public  static void print(float [] array) {
        {
            System.out.print("[");
            for (int i = 0; i < array.length; i++) {
                if (i == array.length - 1) {
                    System.out.print(array[i]);
                } else
                    System.out.print(array[i] + ",");

            }
            System.out.print("]");
                 }
    }
    public  static void print(double [] array)
    {
        System.out.print("[");
        for(int i=0;i< array.length;i++)
        {if(i== array.length-1)
        {
            System.out.print(array[i]);
        }else
            System.out.print(array[i] + ",");

        }
        System.out.print("]");
    }
    }

