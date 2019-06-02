package com.learning.solid.good;

import java.util.List;

public class PerimeterOperations {

    public double calculatePerimeter(Rectangle rectangle){
        return 2*(rectangle.getWidth()+rectangle.getHeight());
    }
    public double sumPerimeters(List<Rectangle> listRectangles) {
        double area = 0;
        for (Rectangle rectangle : listRectangles) {
            area += calculatePerimeter(rectangle);
        }
        return area;
    }
}
