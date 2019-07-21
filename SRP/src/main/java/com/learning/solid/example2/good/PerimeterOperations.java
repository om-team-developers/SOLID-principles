package com.learning.solid.example2.good;

import java.util.List;

public class PerimeterOperations {

    /**
     *
     * @param rectangle is the object of Rectangle Class
     * @return calculated value of perimeter of @Param rectangle
     */
    public double calculatePerimeter(Rectangle rectangle) {
        return 2 * (rectangle.getWidth() + rectangle.getHeight());
    }

    /**
     *
     * @param listRectangles is the list of Rectangle Class Object
     * @return sum of Perimeter of @param listRectangles.
     */
    public double sumPerimeters(List<Rectangle> listRectangles) {
        double area = 0;
        for (Rectangle rectangle : listRectangles) {
            area += calculatePerimeter(rectangle);
        }
        return area;
    }
}
