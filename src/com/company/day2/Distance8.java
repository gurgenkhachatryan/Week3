package com.company.day2;

public class Distance8 {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        System.out.println(calculateDistance(x, y));
        int x1 = 2;
        int y1 = 2;
        int x2 = 5;
        int y2 = 5;
        System.out.println(calculateDistance(x1, y1, x2, y2));

    }

    public static double calculateDistance(int x, int y) {
        double erkxy = Math.sqrt(x * x + y * y);
        return erkxy;
    }

    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        double erkxxyy = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        return erkxxyy;
    }

}