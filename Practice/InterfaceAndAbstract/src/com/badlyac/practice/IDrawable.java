package com.badlyac.practice;

public interface IDrawable {
    default void draw() {
        System.out.println("Drawing a shape");
    }
}
