package com.mcu.javaProj__20261001.大一計概.選擇結構;

import java.util.Scanner;

public class SelectionStructure_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入成績: ");
        int score = sc.nextInt();

        char grade = switch (score / 10) {
            case 10, 9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            case 6 -> 'D';
            default -> 'F';
        };

        System.out.println("等級: " + grade);
        sc.close();
    }
}