package com.mcu.javaProj__20261001;

import java.util.Scanner;

public class NextAndNextLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // example input: Wrong never comes right!!
        String s = sc.next();
        String s1 = sc.nextLine();

        System.out.println(s); // next()方法只會讀到空白字元為止
        System.out.println(s1); // nextLine() 則會讀取整行
        sc.close();
    }
}