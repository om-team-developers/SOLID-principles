package com.learning.solid.good;

public class Rectangle {
    private double height;
    private double width;

    public Rectangle(double width, double height){
        setWidth(width);
        setHeight(height);
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


}
