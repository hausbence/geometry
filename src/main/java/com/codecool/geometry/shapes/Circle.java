package com.codecool.geometry.shapes;

import java.util.Scanner;

public class Circle extends Shape {

    double radius;

    public Circle() {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        String radius = data.nextLine();
        this.radius = Double.parseDouble(radius);
    }

    public String toString() {
        return "Circle"  + "Radius: " + radius;
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
