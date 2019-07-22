package com.learning.solid.example3.good;

public class Rectangle extends Shape{
    private double height;
    private double width;

    public Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }
    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return height*width;
    }
}
