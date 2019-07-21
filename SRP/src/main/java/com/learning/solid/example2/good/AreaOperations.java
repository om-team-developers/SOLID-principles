package com.learning.solid.example2.good;

import java.util.List;

public class AreaOperations {

    /**
     * @param rectangle is the singular object of Rectangle Class.
     * @return calculated area of Rectangle @param rectangle.
     */
    public double calculateArea(Rectangle rectangle) {
        return rectangle.getWidth() * rectangle.getHeight();
    }

    /**
     * @param listRectangles is the list of Object of Rectangle Class
     * @return sum of Calculated Areas of list of Rectangle Objects.
     */
    public double sumAreas(List<Rectangle> listRectangles) {
        double area = 0;
        for (Rectangle rectangle : listRectangles) {
            area += (rectangle.getHeight() * rectangle.getWidth());
        }

        return area;
    }
}
