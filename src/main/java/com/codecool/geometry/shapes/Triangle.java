package com.codecool.geometry.shapes;

import java.util.Scanner;

public class Triangle extends Shape {
    double side1;
    double side2;
    double side3;
    double altitude;

    /**
     * Calculates a regular triangle's area.
     * regular: every side has different lengths
     */

    public Triangle() {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter the 1st side of the triangle: ");
        String userInput = data.nextLine();
        System.out.println("Enter the 2nd side of the triangle: ");
        String userInput2 = data.nextLine();
        System.out.println("Enter the 3rd side of the triangle: ");
        String userInput3 = data.nextLine();
        this.side1 = Double.parseDouble(userInput);
        this.side2 = Double.parseDouble(userInput2);
        this.side3 = Double.parseDouble(userInput3);
        this.altitude = Math.sqrt((side1 + side2 + side3)
                * (-side1 + side2 + side3)
                * (side1 - side2 + side3)
                * (side1 + side2 - side3));
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
