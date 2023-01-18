package com.bridgelabz.line_Compraison;
public class LineComparison {
    public static void main(String[] args) {

        Line line1 = new Line();
        System.out.println("Enter the points for line 1 : ");
        line1.getPointsInput();
        Line line2 = new Line();
        System.out.println("Enter the points for line 2 : ");
        line2.getPointsInput();
        Line.checkingEqualityOfLines(line1,line2);
        Line.comparingLengthOfLines(line1,line2);
    }
}
