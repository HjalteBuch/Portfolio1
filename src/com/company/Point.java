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
        // This point has to be larger that Point p
        double distance;
        if(this.x <= p.getX() && this.y <= p.getY()){
            distance = Math.sqrt((p.getX()-x)^2 + (p.getY()-y)^2);
        } else if(this.x <= p.getX() && this.y >= p.getY()){
            distance = Math.sqrt((p.getX()-x)^2 + (y-p.getY())^2);
        } else if(this.x >= p.getX() && this.y >= p.getY()){
            distance = Math.sqrt((x-p.getX())^2 + (y-p.getY())^2);
        } else {
            distance = Math.sqrt((x-p.getX())^2 + (p.getY()-y)^2);
        }
        return distance;
    }
}
