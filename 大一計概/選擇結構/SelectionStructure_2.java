package com.mcu.javaProj__20261001.大一計概.選擇結構;

import java.util.Scanner;

public class SelectionStructure_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();

        if (s > 100 || s < 0) {
            System.out.println("輸入資料錯誤");
        } else if (s >= 80 && s <= 89) {
            System.out.println("等級B");
        }

        sc.close();
    }
}
