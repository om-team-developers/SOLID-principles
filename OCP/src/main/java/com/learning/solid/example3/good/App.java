package com.learning.solid.example3.good;

import java.util.ArrayList;
import java.util.List;

public class App {
    /**
     * Main executor
     * @param args commandline arguments
     */
    public static void main(String[] args){
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(10,10);
        List<Shape> shapes  = new ArrayList<Shape>();
        shapes.add(circle);
        shapes.add(rectangle);
        System.out.println(AreaCalculator.getArea(shapes));
    }
}
