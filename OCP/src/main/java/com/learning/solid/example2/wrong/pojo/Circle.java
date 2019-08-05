package com.learning.solid.example2.wrong.pojo;

public class Circle {

        private double radius;

        /**
         *
         * @param radius radius of circle
         */
        public Circle(double radius){
            this.radius = radius;
            System.out.println("circle of radius:-> "+radius);
        }

        /**
         * @return current circle radius
         */
        public double getRadius() {
            return radius;
        }

}
