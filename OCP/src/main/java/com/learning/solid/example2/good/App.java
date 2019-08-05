package com.learning.solid.example2.good;

import com.learning.solid.example2.good.impl.CircleImpl;
import com.learning.solid.example2.good.impl.RectangleImpl;
import com.learning.solid.example2.good.operations.AreaCalculator;
import com.learning.solid.example2.good.operations.PerimeterCalculator;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args){
        CircleImpl circle = new CircleImpl(5);
        RectangleImpl rectangle = new RectangleImpl(12,10);
        List<Shape> shapes  = new ArrayList<Shape>();
        shapes.add(circle);
        shapes.add(rectangle);
        System.out.println("::: Sum of Areas Calculator ::::");
        System.out.println(AreaCalculator.getArea(shapes));
        System.out.println("::: Sum of Perimeter Calculator ::::");
        System.out.println(PerimeterCalculator.getPerimeter(shapes));
    }
}
