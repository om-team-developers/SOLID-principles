package com.learning.solid.wrong;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTests {
    private static final double DELTA = 1e-15;
    @Test
    public void assertArea(){

        Rectangle rectangle = new Rectangle(5,4);
        Assert.assertEquals(20.0,rectangle.calculateArea(),DELTA);
        System.out.println(":::: Asserts Area completed ::::");
    }

    @Test
    public void assertPerimeter(){
        Rectangle rectangle = new Rectangle(5,4);
        Assert.assertEquals(18.0,rectangle.calculatePerimeter(),DELTA);
        System.out.println("::: Perimeter Assertion Completed :::");
    }
}
