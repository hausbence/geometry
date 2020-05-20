package com.codecool.geometry.shapes;

import java.util.Scanner;

public class EquilateralTriangle extends Triangle {

    double side;
    double altitude;

    public EquilateralTriangle() {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter the length of the sides: ");
        String userInput = data.nextLine();
        this.side = Double.parseDouble(userInput);
        this.altitude = (Math.sqrt(3) / 2) * side;
    }

    @Override
    public double calculateArea() {
        return (altitude * side) / 2 ;
    }

    @Override
    public double calculatePerimeter() {
        return side * 3;
    }
}
