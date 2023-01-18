package com.bridgelabz.line_Compraison;

public class Line {

    Point point1 = new Point();
    Point point2 = new Point();

    public double calculateLineLength() {

        double length = Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point1.getY(), 2));

        return length;

    }
    public void getPointsInput(){
        System.out.println("Enter point1 co-ordinates : ");
        point1.getPoints();
        System.out.println("Enter point2 co-ordinates : ");
        point2.getPoints();
    }
    public static void comparingLengthOfLines(Line line1,Line line2){

        Double length1 = line1.calculateLineLength();
        Double length2 = line2.calculateLineLength();

        System.out.println("Line 1 length is : " + length1);
        System.out.println("Line 2 length is : " + length2);
        int res = length1.compareTo(length2);

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
    public static void checkingEqualityOfLines(Line line1 , Line line2 ){

        Double length1 = line1.calculateLineLength();
        Double length2 = line2.calculateLineLength();

        System.out.println("Line 1 length is : " + length1);
        System.out.println("Line 2 length is : " + length2);

        if (length1.equals(length2)){
            System.out.println("Line 1 length is equal to Line 2 length");
        }
        else {
            System.out.println("Line 1 length is not equal to Line 2 length");
        }

    }
}
