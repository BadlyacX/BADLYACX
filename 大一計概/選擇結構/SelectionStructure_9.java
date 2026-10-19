package com.mcu.javaProj__20261001.大一計概.選擇結構;

import java.util.Scanner;

public class SelectionStructure_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("輸入整月工時及固定時薪: (工時, 時薪)");
        String str = sc.nextLine();
        String[] strArr = str.trim().split("\\s*,\\s*");

        int workTime = Integer.parseInt(strArr[0]);
        int baseSalary = Integer.parseInt(strArr[1]);

        if (workTime <= 40) {
            printSalary(baseSalary, 1);
        } else if (workTime <= 60) {
            printSalary(baseSalary, 1.33);
        } else if (workTime <= 80) {
            printSalary(baseSalary, 1.66);
        } else if (workTime <= 120) {
            printSalary(baseSalary, 2);
        }

        sc.close();
    }

    static void printSalary(int baseSalary, double multiplier) {
        System.out.printf("薪資: %s元", baseSalary * multiplier);
    }
}
