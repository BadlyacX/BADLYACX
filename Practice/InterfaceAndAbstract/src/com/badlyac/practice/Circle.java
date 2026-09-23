package com.badlyac.practice;

public class Circle extends Shape implements IDrawable, IComparable2D {

    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public int compareArea(Shape other) {
        return Double.compare(this.getArea(), other.getArea());
        // if a > b return 1, a < b return -1
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius: " + this.radius);
    }
}
