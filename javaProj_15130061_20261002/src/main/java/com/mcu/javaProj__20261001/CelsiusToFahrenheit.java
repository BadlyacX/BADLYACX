package com.mcu.javaProj__20261001;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("輸入攝氏溫度(C): "); // example input: 25.63

        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 1.8) + 32;

        BigDecimal bd = BigDecimal.valueOf(fahrenheit).setScale(2, RoundingMode.HALF_UP);
        fahrenheit = bd.doubleValue();
        System.out.println("轉換成華氏溫度(F) : " + fahrenheit);

        sc.close();
    }
}