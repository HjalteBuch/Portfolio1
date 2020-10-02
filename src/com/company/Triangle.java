package com.company;


public class Triangle extends Shape {
    private Point p1;
    private Point p2;
    private Point p3;

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(Point p1, Point p2, Point p3){
        super();
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.sideA = p1.distanceToPoint(p2);
        this.sideB = p2.distanceToPoint(p3);
        this.sideC = p3.distanceToPoint(p1);
    }

    public void getCenter(){
        int centerX = (p1.getX()+p2.getX()+p3.getX())/2;
        int centerY = (p1.getY()+p2.getY()+p3.getY())/2;
        Point center = new Point(centerX,centerY);
        System.out.println("The center of this triangle is: " + center);
    }

    public void getArea(){
        double area = (p1.getX()*(p2.getY() - p3.getY()) + p2.getX() * (p3.getY()-p1.getY()) + p3.getX() * (p1.getY()- p2.getY()))/2;
        System.out.println("The area of this triangle is: " + area);
    }

    public void getCircumference(){
        double circumference = sideA + sideB + sideC;
        System.out.println("The circumference of this triangle is: " + circumference);
    }
}
