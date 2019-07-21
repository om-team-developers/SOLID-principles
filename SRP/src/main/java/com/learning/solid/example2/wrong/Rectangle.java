package com.learning.solid.example2.wrong;

import java.util.List;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(int width, int height) {
        this.setWidth(width);
        this.setHeight(height);
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(int length) {
        this.width = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double calculateArea() {
        return this.width * this.height;
    }

    public double calculatePerimeter() {
        return 2 * (this.width + this.height);
    }

    /**
     *
     * @param listRectangles list of object of Rectangle Class
     * @return sum of areas of list of Rectangles of @param listRectangles
     */
    public static double sumAreas(List<Rectangle> listRectangles) {
        double area = 0;
        for (Rectangle rectangle : listRectangles) {
            area += (rectangle.calculateArea());
        }

        return area;
    }

    /**
     *
     * @param listRectangles list of Rectangle
     * @return sum of the perimeter of each Rectangle Object of @param listRectangles
     */
    public static double sumPerimeters(List<Rectangle> listRectangles) {
        double area = 0;
        for (Rectangle rectangle : listRectangles) {
            area += (rectangle.calculatePerimeter());
        }
        return area;
    }


}
