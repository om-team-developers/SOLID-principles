package com.learning.solid.example2.good;
import org.junit.Assert;
import org.junit.Test;

public class AreaOperationsTests {
    private static final double DELTA = 1e-15;
    @Test
    public void assertArea(){
        Rectangle rectangle = new Rectangle(5,4);
        AreaOperations areaOperations = new AreaOperations();
        Assert.assertEquals(20.0,areaOperations.calculateArea(rectangle),DELTA);
    }
}
