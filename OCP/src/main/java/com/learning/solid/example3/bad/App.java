package com.learning.solid.example3.bad;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dimanandhar on 7/22/19.
 */
public class App {
    /**
     * Main executor
     * @param args commandline arguments
     */
    public static void main(String[] args){
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(10,10);
        List<Object> shapes  = new ArrayList<Object>();
        shapes.add(circle);
        shapes.add(rectangle);
        System.out.println(ModifiedAreaOperations.getArea(shapes));
    }
}
