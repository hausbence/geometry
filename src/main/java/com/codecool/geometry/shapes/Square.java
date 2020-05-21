package com.codecool.geometry.shapes;


public class Square extends Rectangle {

    private final double side;

    public Square(double side) {
        super(side,side);
        this.side = side;
    }

    public String toString() {
        return "Square, side = " + side;
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
