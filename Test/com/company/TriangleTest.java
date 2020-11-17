package com.company;

import junit.framework.TestCase;

public class TriangleTest extends TestCase {
    Triangle triangle = new Triangle("Triangle", new Point(10,10), new Point(15,5), new Point(7, 57));

    public void testCalculateArea() {
        assertEquals(52.612,triangle.getSideA());
        assertEquals(47.096,triangle.getSideB());
        assertEquals(7.071,triangle.getSideC());
    }

    public void testCalculateCenter() {
        assertEquals(new Point(10, 24),triangle.calculateCenter());
    }

    public void testCalculateCircumference() {
        assertEquals(106.779, triangle.calculateCircumference());
    }
}