package com.bridgelabz.line_Compraison;

import java.util.Scanner;

public class LineComparison {

    static void calculateLength( int x1,int y1,int x2, int y2){

        double Length = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println(Length);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x1 co-ordinate");
        int x1 = scanner.nextInt();
        System.out.println("Enter y1 co-ordinate");
        int y1 = scanner.nextInt();
        System.out.println("Enter x2 co-ordinate");
        int x2 = scanner.nextInt();
        System.out.println("Enter y2 co-ordinate");
        int y2 = scanner.nextInt();
        calculateLength(x1,y1,x2,y2);

    }
}
