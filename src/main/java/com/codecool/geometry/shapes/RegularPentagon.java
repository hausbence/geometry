package com.codecool.geometry.shapes;

import java.util.Scanner;

public class RegularPentagon extends Shape {

    double side;

    public RegularPentagon() {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter the length of the side of the pentagon: ");
        String userInput = data.nextLine();
        this.side = Double.parseDouble(userInput);
    }

    public String toString() {
        return "Pentagon, side: " + side;
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
