package com.badlyac.practice;

public class Rectangle extends Shape implements IDrawable, IComparable2D{

    private final double width;
    private final double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public int compareArea(Shape other) {
        return Double.compare(this.getArea(), other.getArea());
    }
}
