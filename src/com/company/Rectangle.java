package com.company;

public class Rectangle extends Shape{
    private Point point;
    private int height;
    private int width;

    public Rectangle(String name, Point point, int height, int width) {
        super(name);
        this.point = point;
        this.height = height;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return height * width;
    }

    @Override
    Point calculateCenter() {
        int x = point.getX() + (width/2);
        int y = point.getY() + (height/2);
        return new Point(x, y);
    }

    @Override
    double calculateCircumference() {
        return width * 2 + height * 2;
    }
}
