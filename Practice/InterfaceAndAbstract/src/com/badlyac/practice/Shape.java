package com.badlyac.practice;

abstract class Shape {
    protected String color;

    Shape(String color) {
        this.color = color;
    }

    abstract double getArea();

    public void printInfo() {
        System.out.println("color: " + color + ", area: " + getArea());
    }
}
