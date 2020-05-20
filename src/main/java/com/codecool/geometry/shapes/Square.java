package com.codecool.geometry.shapes;

import java.util.Scanner;

public class Square extends Rectangle {

    double side;

    public Square() {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter the length of the side of the square: ");
        String userInput = data.nextLine();
        this.side = Double.parseDouble(userInput);
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}
