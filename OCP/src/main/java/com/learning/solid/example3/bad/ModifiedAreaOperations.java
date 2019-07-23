package com.learning.solid.example3.bad;

import java.util.List;

/**
 * Created by dimanandhar on 7/22/19.
 */
public class ModifiedAreaOperations {

    /**
     *
     * @param shapes list of shapes
     * @return total area of shapes
     */
    public static double getArea(List<Object> shapes) {
        double area = 0;
        System.out.println("Calculating Area>>>");

        for(Object shape: shapes)
        {
            if (shape instanceof Rectangle)
            {
                Rectangle rectangle = (Rectangle) shape;
                area += rectangle.getWidth()*rectangle.getHeight();
            }
        else
            {
                Circle circle = (Circle) shape;
                area += circle.getRadius()*circle.getRadius()*Math.PI;
            }
        }
        return area;
    }
}
