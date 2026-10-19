package com.mcu.javaProj__20261001.大一計概.選擇結構;

import java.util.Scanner;

public class SelectionStructure_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();

        if (n % 2 ==0) {
            System.out.println(n + "是偶數");
        } else {
            System.out.println(n + "是奇數");
        }

        sc.close();
    }
}
