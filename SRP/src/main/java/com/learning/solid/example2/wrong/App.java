package com.learning.solid.example2.wrong;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Rectangle> listRectangles = new ArrayList<Rectangle>();
        listRectangles.add(new Rectangle(10, 20));
        listRectangles.add(new Rectangle(15, 20));
        listRectangles.add(new Rectangle(20, 30));

        //10*20 + 10*20 + 20*30 = 1000
        System.out.println("::: Sum of Areas of Rectangles :::" + Rectangle.sumAreas(listRectangles));
        System.out.println("::: Sum of Perimeter of Rectangles :::" + Rectangle.sumPerimeters(listRectangles));

    }
}
