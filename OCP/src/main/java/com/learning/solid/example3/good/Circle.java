package com.learning.solid.example3.good;

public class Circle extends Shape{
    private double radius;

    /**
     * Constructor
     * @param radius radius of circle
     */
    public Circle(double radius){
      this.radius = radius;
    }


    /**
     * @return radius of circle
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @return area of cirlce
     */
    public double getArea() {
        return radius*radius*Math.PI;
    }
}
