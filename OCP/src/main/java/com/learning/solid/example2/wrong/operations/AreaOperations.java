package com.learning.solid.example2.wrong.operations;

import com.learning.solid.example2.wrong.pojo.Circle;
import com.learning.solid.example2.wrong.pojo.Rectangle;

import java.util.List;

public class AreaOperations {
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
                area += rectangle.getLength()*rectangle.getBreadth();
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
