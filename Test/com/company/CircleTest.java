package com.company;

import junit.framework.TestCase;

public class CircleTest extends TestCase {
    Circle circle = new Circle("Circle", new Point(10,10), 5);

    public void testCalculateArea() {
        assertEquals(78.5, circle.calculateArea());
    }

    public void testCalculateCenter() {
    }

    public void testCalculateCircumference() {
        assertEquals(31.4, circle.calculateCircumference());
    }
}