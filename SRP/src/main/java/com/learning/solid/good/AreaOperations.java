package com.learning.solid.good;

import java.util.List;

public class AreaOperations {

    public double calculateArea(Rectangle rectangle){
        return rectangle.getWidth() * rectangle.getHeight();
    }
    public double sumAreas(List<Rectangle> listRectangles) {
        double area = 0;
        for (Rectangle rectangle : listRectangles) {
            area += (rectangle.getHeight() * rectangle.getWidth());
        }

        return area;
    }
}
