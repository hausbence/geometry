package com.codecool.geometry.shapes;

import java.util.Scanner;

public class Circle extends Shape {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Circle, "  + "Radius: " + radius;
    }

    public static String getAreaFormula() {
        return "The formula of the area: Math.PI * (radius * radius)";
    }

    public static String getPerimeterFormula() {
        return "The formula of the perimeter: 2 * Math.PI * radius";
    }

    @Override
    public double calculateArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
