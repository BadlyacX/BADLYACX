package com.badlyac.schoolproject;

import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num + "的3次方=" + cub(num));

    }

    static int cub(int x) {
        if (-1000 <= x && x <= 1000) {
            return x * x * x;
        } else return 0;
    }
}
