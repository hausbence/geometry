package com.codecool.geometry;

import com.codecool.geometry.containers.ShapeCollection;
import com.codecool.geometry.shapes.Circle;
import com.codecool.geometry.shapes.EquilateralTriangle;
import com.codecool.geometry.shapes.Rectangle;
import com.codecool.geometry.shapes.RegularPentagon;
import com.codecool.geometry.shapes.Square;
import com.codecool.geometry.shapes.Triangle;

public class Menu {
    public static void mainMenu() {
        System.out.println("\nWelcome!");
        System.out.println("Choose an option:\n");
        System.out.println("0.) Exit the program");
        System.out.println("\n1.) Add new shape");
        System.out.println("2.) Show all shapes");
        System.out.println("3.) Show shape with largest perimeter");
        System.out.println("4.) Show shape with largest area");
        System.out.println("5.) Show formulas ");
    }

    public static void shapeMenu() {
        System.out.println("\n1.) Circle");
        System.out.println("2.) EquilateralTriangle");
        System.out.println("3.) Rectangle");
        System.out.println("4.) Square");
        System.out.println("5.) Triangle");
        System.out.println("6.) Pentagon");

    }
}
