package com.company;


public class Main {

    public static void main(String[] args) {
        Point center = new Point(20,20);
        Shape circle = new Circle(center, 10);
        circle.getArea();
        circle.getCenter();
        circle.getCircumference();

        Shape rectangle = new Rectangle(center,10,10);
        rectangle.getArea();
        rectangle.getCenter();
        rectangle.getCircumference();

        Point p1 = new Point(4,1);
        Point p2 = new Point(2,1);
        Point p3 = new Point(0,2);

        Shape triangle = new Triangle(p1, p2, p3);
        triangle.getArea();
        triangle.getCenter();
        triangle.getCircumference();
    }
}
