package com.learning.solid.example2.good.operations;

import com.learning.solid.example2.good.Shape;

import java.util.List;

public class PerimeterCalculator {

    /**
     *
     * @param shapeList
     * @return provides the sum of perimeter of provided @param shapeList.
     */
    public static double getPerimeter(List<Shape> shapeList){
        double perimeterSum =0;
        for(Shape shape: shapeList){
            perimeterSum = perimeterSum + shape.getPerimeter();
        }
        return perimeterSum;
    }
}
