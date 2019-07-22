package com.learning.solid.example3.good;

import java.util.List;

/**
 * Created by dimanandhar on 7/22/19.
 */
public class AreaCalculator {

    public static double getArea(List<Shape> shapes)
    {
        double area = 0;
        for(Shape shape:shapes){
            area += shape.getArea();
        }
        return area;
    }
}
