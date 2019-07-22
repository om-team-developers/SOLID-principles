package com.learning.solid.example3.bad;

public class Rectangle {
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
        System.out.println("Building circle of height>>"+height + " width>>"+width);
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

}
