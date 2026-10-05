package com.mcu.javaProj__20261001;

import java.util.Scanner;

public class DayToWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("輸入天數: ");

        int day = sc.nextInt();
        int weeks = day / 7;
        int remain = day % 7;

        System.out.println(day + "天是" + weeks + "周又" + remain + "天");
        sc.close();
    }
}