package com.bridgelabz.line_Compraison;

import java.util.Scanner;

public class LineComparison {

    static void calculateLength(double x11,double y11,double x12,double y12,double x21,double y21,double x22,double y22){

        Double line1Length = Math.sqrt(Math.pow(x12-x11,2)+Math.pow(y12-y11,2));
        System.out.println("Line 1 length = " + line1Length);
        System.out.println();
        Double line2Length = Math.sqrt(Math.pow(x22-x21,2)+Math.pow(y22-y21,2));
        System.out.println("Line 2 length = " + line2Length);
        System.out.println();

        int res = line1Length.compareTo(line2Length);

        if (res == 0){
            System.out.println("Line 1 length is equal to Line 2 length");
        }
        else if (res == 1) {
            System.out.println("Line 1 length is greater than Line 2 length");
        }
        else {
            System.out.println("Line 1 length is smaller than Line 2 length");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Line1 x11 co-ordinate");
        int x11 = input.nextInt();
        System.out.println("Enter Line1 y11 co-ordinate");
        int y11 = input.nextInt();
        System.out.println("Enter Line1 x12 co-ordinate");
        int x12 = input.nextInt();
        System.out.println("Enter Line1 y12 co-ordinate");
        int y12 = input.nextInt();
        System.out.println("Enter Line2 x21 co-ordinate");
        int x21 = input.nextInt();
        System.out.println("Enter Line2 y21 co-ordinate");
        int y21 = input.nextInt();
        System.out.println("Enter Line2 x22 co-ordinate");
        int x22 = input.nextInt();
        System.out.println("Enter Line2 y22 co-ordinate");
        int y22 = input.nextInt();
        System.out.println();
        calculateLength(x11,y11,x12,y12,x21,y21,x22,y22);

    }
}
