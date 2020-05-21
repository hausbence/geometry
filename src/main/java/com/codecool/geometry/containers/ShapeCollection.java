package com.codecool.geometry.containers;

import com.codecool.geometry.shapes.Circle;
import com.codecool.geometry.shapes.Shape;

import java.util.ArrayList;
import java.util.Scanner;


public class ShapeCollection {
    private static ArrayList<Shape> shapes = new ArrayList<>();

    public static void addShape(Shape shape) {
        shapes.add(shape);
    }

    public static String getShapesTable() {
        StringBuilder stringBuilder = new StringBuilder();
        shapes.forEach(shape -> {
            stringBuilder.append(shape.toString());
        });
        return stringBuilder.toString();
    }

    public Shape getLargestShapeByPerimeter() {
        if (!shapes.isEmpty()) {
            Shape maxPerimeterShape = shapes.get(0);
            for(Shape shape : shapes){
                if (shape.calculatePerimeter() > maxPerimeterShape.calculatePerimeter()) {
                    maxPerimeterShape = shape;
                }
            }
            return maxPerimeterShape;
        } else {
            return null;
        }
    }

    public Shape getLargestShapeByArea() {
        if (!shapes.isEmpty()) {
            Shape maxAreaShape = shapes.get(0);
            for(Shape shape : shapes){
                if (shape.calculateArea() > maxAreaShape.calculateArea()) {
                    maxAreaShape = shape;
                }
            }
            return maxAreaShape;
        } else {
            return null;
        }
    }

}
