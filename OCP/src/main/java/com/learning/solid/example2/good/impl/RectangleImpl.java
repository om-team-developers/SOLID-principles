package com.learning.solid.example2.good.impl;

import com.learning.solid.example2.good.Shape;
import com.learning.solid.example2.good.pojo.Rectangle;

public class RectangleImpl extends Rectangle implements Shape {

    public RectangleImpl(double length, double breadth){
        super(length,breadth);
    }

    public double getArea() {
        return length*breadth;
    }

    public double getPerimeter() {
        return 2*(length * breadth);
    }
}
