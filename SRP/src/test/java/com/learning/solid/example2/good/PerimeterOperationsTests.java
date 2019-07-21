package com.learning.solid.example2.good;

import org.junit.Assert;
import org.junit.Test;

public class PerimeterOperationsTests {
    private static final double DELTA = 1e-15;
    @Test
    public void assertPerimeter(){
        Rectangle rectangle = new Rectangle(4,5);
        PerimeterOperations perimeterOperations = new PerimeterOperations();
        Assert.assertEquals(18.0,perimeterOperations.calculatePerimeter(rectangle),DELTA);
    }
}
