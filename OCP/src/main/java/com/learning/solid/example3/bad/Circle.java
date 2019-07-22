package com.learning.solid.example3.bad;

public class Circle {
    private double radius;

    public Circle(double radius){
      this.radius = radius;
        System.out.println("Building circle of radius>>"+radius);
    }
    public double getRadius() {
        return radius;
    }

}
