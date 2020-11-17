package com.company;


public class Main {

    public static void main(String[] args) {
        Shape shapes[] = {
                new Circle("Circle", new Point(2,1), 3),
                new Rectangle("Rectangle", new Point(4,5),5,8),
                new Triangle("Triangle", new Point(10,10), new Point(8,15), new Point(12, 15))
        };
        for(int i = 0; i < shapes.length; i++){
            System.out.println(shapes[i]);
        }

        Triangle triangle = new Triangle("Triangle", new Point(10,10), new Point(15,5), new Point(7, 57));
        System.out.println(triangle.getSideA());
        System.out.println(triangle.getSideB());
        System.out.println(triangle.getSideC());
    }
}
