package com.codecool.geometry.shapes;


public class EquilateralTriangle extends Triangle {

    private final double side;
    private final double altitude;

    public EquilateralTriangle(double side) {
        super(side, side, side);
        this.side = side;
        this.altitude = (Math.sqrt(3) / 2) * side;
    }

    public String toString() {
        return "Triangle, "  + "Side: " + side + ", Altitude: " + altitude;
    }

    public static String getAreaFormula() {
        return "The formula of the area: (altitude * a) / 2";
    }

    public static String getPerimeterFormula() {
        return "The formula of the perimeter: a * 3";
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
