package com.codecool.geometry.shapes;

import java.util.Scanner;

public class Triangle extends Shape {
    private final double side1;
    private final double side2;
    private final double side3;
    private final double altitude;

    /**
     * Calculates a regular triangle's area.
     * regular: every side has different lengths
     */

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.altitude = Math.sqrt((side1 + side2 + side3)
                * (-side1 + side2 + side3)
                * (side1 - side2 + side3)
                * (side1 + side2 - side3));
    }

    public String toString() {
        return "Triangle, Sides: a = " + side1 + "b = " + side2 + "c = " + side3
                + ", Altitude: " + altitude;
    }

    public static String getAreaFormula() {
        return "The formula of the area: (a * altitude) / 2";
    }

    public static String getPerimeterFormula() {
        return "The formula of the perimeter: a + b + c";
    }

    @Override
    public double calculateArea() {
        return (side1 * altitude) / 2;
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
