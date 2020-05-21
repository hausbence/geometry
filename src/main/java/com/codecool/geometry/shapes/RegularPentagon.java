package com.codecool.geometry.shapes;

import java.util.Scanner;

public class RegularPentagon extends Shape {

    private final double side;

    public RegularPentagon(double side) {
        this.side = side;
    }

    public String toString() {
        return "Pentagon, side: " + side;
    }

    public static String getAreaFormula() {
        return "The formula of the area: Math.sqrt(5 * (5 + 2 * Math.sqrt(5)) * (a*a)) / 4";
    }

    public static String getPerimeterFormula() {
        return "The formula of the perimeter: 5 * a";
    }

    @Override
    public double calculateArea() {
        return Math.sqrt(5 * (5 + 2 * Math.sqrt(5)) * (side*side)) / 4;
    }

    @Override
    public double calculatePerimeter() {
        return 5 * side;
    }
}
