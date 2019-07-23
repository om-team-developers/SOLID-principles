package com.learning.solid.example3.good;

public class Rectangle extends Shape{
    private double height;
    private double width;

    /**
     * constructor for creating rectangle object
     * @param width rectangle's width
     * @param height rectangle's height
     */
    public Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }

    /**
     * @return height of rectangle
     */
    public double getHeight() {
        return height;
    }

    /**
     * @return width of rectangle
     */
    public double getWidth() {
        return width;
    }

    /**
     * @return area of rectangle
     */
    public double getArea() {
        return height*width;
    }
}
