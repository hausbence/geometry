package com.codecool.geometry;

import com.codecool.geometry.containers.ShapeCollection;
import com.codecool.geometry.shapes.*;
import com.codecool.geometry.Menu;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    private static Scanner data = new Scanner(System.in);

    public static void main(String[] args) {

        boolean isRunning = true;



	    while (isRunning) {
            Menu.mainMenu();
            String userInput = data.nextLine();
	        int option = Integer.parseInt(userInput);
            switch (option) {
                case 1:
                    addShape();
                    break;
                case 2:
                    showAllShapes();
                    break;
                case 3:
                    ShapeCollection perimeter = new ShapeCollection();
                    System.out.println(perimeter.getLargestShapeByPerimeter());
                    break;
                case 4:
                    ShapeCollection area = new ShapeCollection();
                    System.out.println(area.getLargestShapeByArea());
                    break;
                case 5:
                    getFormula();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }

    private static void getFormula() {
        Menu.shapeMenu();
        String shapeInput = data.nextLine();
        int option = Integer.parseInt(shapeInput);
        switch(option) {
            case 1:
                System.out.println("Circle area: π×r×r | perimeter: 2×π×r");
                break;
            case 2:
                System.out.println("EquilateralTriangle area : a×a×sqrt(3)/4 | perimeter: 3xa ");
                break;
            case 3:
                System.out.println("Rectangle area: a*b | perimeter: 2×a+2×b");
                break;
            case 4:
                System.out.println("Square area: a*a | perimeter: 4*a");
                break;
            case 5:
                System.out.println("Triangle area: sqrt(s×(s-a)×(s-b)×(s-c)) | perimeter: a+b+c");
                break;
            case 6:
                System.out.println("Pentagon area: a×a×sqrt(5×(5+2×sqrt(5))/4 | perimeter: 5*a");
                break;
        }
    }

    private static void showAllShapes() {
        System.out.println(ShapeCollection.getShapesTable());
    }

    public static void addShape() {
        Menu.shapeMenu();
        String shapeInput = data.nextLine();
        int option = Integer.parseInt(shapeInput);
        switch(option) {
            case 1:
                System.out.println("Enter the radius of the circle: ");
                String radiusInput = data.nextLine();
                double radius = Double.parseDouble(radiusInput);
                Circle circle = new Circle(radius);
                ShapeCollection.addShape(circle);
                break;
            case 2:
                System.out.println("Enter the length of the side: ");
                String sideInput = data.nextLine();
                double side = Double.parseDouble(sideInput);
                EquilateralTriangle eqTriangle = new EquilateralTriangle(side);
                ShapeCollection.addShape(eqTriangle);
                break;
            case 3:
                System.out.println("Enter the length A side of the rectangle: ");
                String sideInput1 = data.nextLine();
                double sideA = Double.parseDouble(sideInput1);
                System.out.println("Enter the B length side of the rectangle: ");
                String sideInput2 = data.nextLine();
                double sideB = Double.parseDouble(sideInput2);
                Rectangle rectangle = new Rectangle(sideA, sideB);
                ShapeCollection.addShape(rectangle);
                break;
            case 4:
                System.out.println("Enter the length of the side: ");
                String squareSide = data.nextLine();
                double sideOfSquare = Double.parseDouble(squareSide);
                Square square = new Square(sideOfSquare);
                ShapeCollection.addShape(square);
                break;
            case 5:
                System.out.println("Enter the length A side of the triangle: ");
                String triangleInput1 = data.nextLine();
                double triangleSideA = Double.parseDouble(triangleInput1);
                System.out.println("Enter the length B side of the triangle");
                String triangleInput2 = data.nextLine();
                double triangleSideB = Double.parseDouble(triangleInput2);
                System.out.println("Enter the length C side of the triangle");
                String triangleInput3 = data.nextLine();
                double triangleSideC = Double.parseDouble(triangleInput3);
                Triangle triangle = new Triangle(triangleSideA, triangleSideB, triangleSideC);
                ShapeCollection.addShape(triangle);
                break;
            case 6:
                System.out.println("Enter the length of the side of the pentagon: ");
                String pentagonInput = data.nextLine();
                double pentagonSide = Double.parseDouble(pentagonInput);
                RegularPentagon pentagon = new RegularPentagon(pentagonSide);
                ShapeCollection.addShape(pentagon);
                break;
        }

    }
}
