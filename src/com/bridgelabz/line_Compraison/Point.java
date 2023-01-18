package com.bridgelabz.line_Compraison;

import java.util.Scanner;

public class Point {

    private double x , y ;

    Point(){

    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void getPoints(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter co-ordinates X : ");
        x = input.nextInt();
        System.out.println("Enter co-ordinates y : ");
        y = input.nextInt();

    }
}
