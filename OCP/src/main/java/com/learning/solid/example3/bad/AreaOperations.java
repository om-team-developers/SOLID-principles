package com.learning.solid.example3.bad;

import java.util.List;

public class AreaOperations {

    public double getArea(List<Rectangle> listRectangles) {
        double area = 0;
        for (Rectangle rectangle : listRectangles) {
            area += (rectangle.getHeight() * rectangle.getWidth());
        }
        return area;
    }
}
