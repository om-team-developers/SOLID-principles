package com.learning.solid.good;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Rectangle> listRectangles = new ArrayList<Rectangle>();
        listRectangles.add(new Rectangle(10, 20));
        listRectangles.add(new Rectangle(15, 20));
        listRectangles.add(new Rectangle( 20, 30));

        AreaOperations areaOperations = new AreaOperations();

        //10*20 + 10*20 + 20*30 = 1000
        double resp = areaOperations.sumAreas(listRectangles);
        PerimeterOperations perimeterOperations = new PerimeterOperations();
        double perimeterResponse = perimeterOperations.sumPerimeters(listRectangles);
        System.out.println("::: sum of areas :::"+resp);
        System.out.println("::: sum of perimeter :::"+perimeterResponse);
    }
}
