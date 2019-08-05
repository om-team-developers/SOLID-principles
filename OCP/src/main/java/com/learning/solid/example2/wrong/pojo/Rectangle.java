package com.learning.solid.example2.wrong.pojo;

public class Rectangle {
    private double length;
    private double breadth;

    /**
     * constructor for creating rectangle object
     * @param breadth rectangle's width
     * @param length rectangle's height
     */
    public Rectangle(double breadth, double length){
        this.length = length;
        this.breadth = breadth;
        System.out.println("Building Rectangle of length:-> "+length + " breadth->"+breadth);
    }

    /**
     * @return length of rectangle
     */
    public double getLength() {
        return length;
    }

    /**
     * @return breadth of rectangle
     */
    public double getBreadth() {
        return breadth;
    }

}
