package com.company;

import java.lang.Math;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public String toString(){
        String point = "X: " + x + ", Y: " + y;
        return point;
    }

    public double distanceToPoint(Point p){
        //sometimes it returns NAN??
        double distance = Math.sqrt((x-p.getX() * (x-p.getX())) + y-p.getY() * (y-p.getY()));
        return distance;
    }
}
