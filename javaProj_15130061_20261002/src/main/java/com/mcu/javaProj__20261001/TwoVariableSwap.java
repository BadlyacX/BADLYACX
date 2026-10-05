package com.mcu.javaProj__20261001;

import java.util.Scanner;

public class TwoVariableSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();
        int temp = a;

        a = b;
        b = temp;

        System.out.println("swapped a: " + a);
        System.out.println("swapped b: " + b);
        sc.close();
    }
}
