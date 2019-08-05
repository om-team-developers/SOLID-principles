package com.learning.solid.example2.good.operations;

import com.learning.solid.example2.good.Shape;

import java.util.List;

public class AreaCalculator {

    /**
     *
     * @param shapes is the array list of Shapes.
     * @return calculate the sum of area of provided shapes.
     */
    public static double getArea(List<Shape> shapes)
    {
        double area = 0;
        for(Shape shape:shapes){
            area += shape.getArea();
        }
        return area;
    }
}
