package com.badlyac.schoolproject;

import java.util.Scanner;

public class MaxMinAndProduct {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        System.out.println("最大值=" + max(a));
        System.out.println("最小值=" + min(a));
        System.out.println("乘積=" + product(a));

    }

    static int max(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            max = Math.max(max, a[i]);
        }
        return max;
    }

    static int min(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++)
            min = Math.min(min, a[i]);
        return min;
    }

    static int product(int[] a) {
        return max(a) * min(a);
    }
}
