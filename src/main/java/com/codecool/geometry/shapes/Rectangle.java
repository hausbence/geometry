package com.codecool.geometry.shapes;

import org.w3c.dom.css.Rect;

import java.util.Scanner;

public class Rectangle extends Shape {

    double side1;
    double side2;

    public Rectangle() {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter the 'a' side of the rectangle: ");
        String side1 = data.nextLine();
        System.out.println("Enter the 'b' side of the rectangle: ");
        String side2 = data.nextLine();
        this.side1 = Double.parseDouble(side1);
        this.side2 = Double.parseDouble(side2);
    }

    public String toString() {
        return "Rectangle, Sides: a =  " + side1 + "b = " + side2;
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
