package com.mcu.javaProj__20261001.大一計概.選擇結構;

import java.util.Scanner;

public class SelectionStructure_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch (day) {
            case 1:
                print("Sun");
                break;
            case 2:
                print("Mon");
                break;
            case 3:
                print("Tue");
                break;
            case 4:
                print("Wed");
                break;
            case 5:
                print("Thu");
                break;
            case 6:
                print("Fri");
                break;
            case 7:
                print("Sat");
                break;
            default:
                print("Null");
        }

        sc.close();
    }

    static void print(String s) {
        System.out.println(s);
    }
}
