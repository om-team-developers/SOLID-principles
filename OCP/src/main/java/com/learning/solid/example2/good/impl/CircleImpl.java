package com.learning.solid.example2.good.impl;

import com.learning.solid.example2.good.Shape;
import com.learning.solid.example2.good.pojo.Circle;

/**
 * Implementation class of Circle.
 */
public class CircleImpl extends Circle implements Shape {

    public CircleImpl(double radius){
        super(radius);
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }

    public double getPerimeter(){
        return 2* Math.PI* radius;
    }
}
