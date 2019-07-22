package com.learning.solid.example3.bad;

public class Rectangle {
    private double height;
    private double width;

    public Rectangle(double width, double height){
        this.height = height;
        this.width = width;
        System.out.println("Building circle of height>>"+height + " width>>"+width);
    }
    public double getHeight() {
        return height;
    }


    public double getWidth() {
        return width;
    }

}
