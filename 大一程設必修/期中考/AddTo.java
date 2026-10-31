package com.badlyac.schoolproject;

import java.util.Scanner;

public class AddTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("1+2+...+" + n + "=" + addto(n));

    }

    static int addto(int n) {
        int sum = 0;
        if (1 <= n && n <= 10000) {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
        } else return 0;
        return sum;
    }
}