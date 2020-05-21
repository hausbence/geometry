package com.codecool.geometry.shapes;

import java.util.Scanner;

public class Rectangle extends Shape {

    private final double side1;
    private final double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public String toString() {
        return "Rectangle, Sides: a =  " + side1 + "b = " + side2;
    }

    public static String getAreaFormula() {
        return "The formula of the area: a * b";
    }

    public static String getPerimeterFormula() {
        return "The formula of the perimeter: (2 * a) + (2 * b)";
    }

    @Override
    public double calculateArea() {
        return side1 * side2;
    }

    @Override
    public double calculatePerimeter() {
        return (2 * side1) + (2 * side2);
    }
}
