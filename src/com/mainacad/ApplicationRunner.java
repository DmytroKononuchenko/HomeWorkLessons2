package com.mainacad;

import com.mainacad.model.*;

public class ApplicationRunner {

    public static void main(String[] args) {

        Circle circle = new Circle(10);

        Square square = new Square(15);

        Triangle triangle = new Triangle(20, 14);

        Shape maxShape;

        if (circle.getArea() > square.getArea()) {
            maxShape = circle;
        } else {
            maxShape = square;
            {

            }
            if (maxShape.getArea() < triangle.getArea()) {

                maxShape = triangle;
            }
        }

        System.out.print("maxShape is " + maxShape.getClass().getSimpleName() + " and area" + maxShape.getArea());
    }

}
