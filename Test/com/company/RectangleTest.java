package com.company;

import junit.framework.TestCase;

public class RectangleTest extends TestCase {
    Rectangle rectangle = new Rectangle("Rect", new Point(10,10), 5, 10);

    public void testCalculateArea() {
        assertEquals(50.0, rectangle.calculateArea());
    }

    public void testCalculateCenter() {
        assertEquals(new Point(15,12),rectangle.calculateCenter());
    }

    public void testCalculateCircumference() {
        assertEquals(30.0, rectangle.calculateCircumference());
    }
}