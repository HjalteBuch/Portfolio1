package com.company;

public class Rectangle extends Shape{
    private Point point;
    private int height;
    private int width;

    public Rectangle(Point point, int height, int width){
        super();
        this.point = point;
        this.height = height;
        this.width = width;
    }

    public void getCenter(){
        //this might have to be inverted?
        int x = point.getX() + (width/2);
        int y = point.getY() + (height/2);
        Point center = new Point(x, y);
        System.out.println("The center of this Rectangle is: " + center);
    }

    public void getArea(){
        int area = height * width;
        System.out.println("The area of this rectangle is: " + area);
    }

    public void getCircumference(){
        double circumference = width * 2 + height * 2;
        System.out.println("The circumference of this rectangle is: " + circumference);
    }
}
