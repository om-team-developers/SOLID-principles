package com.learning.solid.example2.wrong;

import com.learning.solid.example2.wrong.operations.AreaOperations;
import com.learning.solid.example2.wrong.pojo.Circle;

import com.learning.solid.example2.wrong.pojo.Rectangle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by btamang on 8/5/19.
 */
public class App {
    /**
     * Main executor
     * @param args commandline arguments
     */
    public static void main(String[] args){
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5,20);
        List<Object> shapes  = new ArrayList<Object>();
        shapes.add(circle);
        shapes.add(rectangle);
        System.out.println(AreaOperations.getArea(shapes));
    }
}
