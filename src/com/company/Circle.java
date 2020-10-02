package com.company;

public class Circle extends Shape{
    private Point center;
    private int radius;
    private double pi = 3.14;

    public Circle(Point center, int radius){
        super();
        this.center = center;
        this.radius = radius;
    }

    public void getCenter(){
        System.out.println("The center of this circle is: " + center);
    }

    @Override
    public void getArea(){
        double area = pi * (radius*radius);
        System.out.println("The area of this circle is: " + area);
    }

    public void getCircumference(){
        double circumference = radius*2 * pi;
        System.out.println("The circumference of this circle is: " + circumference);
    }
}
