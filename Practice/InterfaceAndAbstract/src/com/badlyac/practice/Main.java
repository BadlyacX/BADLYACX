package com.badlyac.practice;

public class Main {
    static void main(String[] args) {
        Circle circle = new Circle("RED", 10);
        Rectangle rectangle = new Rectangle("RED", 20, 10);

        circle.draw();
        rectangle.draw();

        int result = circle.compareArea(rectangle);
        System.out.println("circle vs rectangle: " + result);
        int result2 = circle.compareArea(rectangle);
        System.out.println("circle vs rectangle: " + result2);

        circle.printInfo();
        rectangle.printInfo();
    }
}
