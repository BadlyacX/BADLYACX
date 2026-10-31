package com.mcu.javaProj__20261001.大一程設.期中考;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.matches("\\d+([+\\-]\\d+)*")) System.out.println("計算結果：" + calculate(s));
        else System.out.println("運算式只能包含正整數、加法、減法運算子");

    }

    static long calculate(String s) {

        String[] numberArr = s.split("[+\\-]");
        char[] operatorArr = s.replaceAll("\\d+", "").toCharArray();
        long result = Long.parseLong(numberArr[0]);

        for (int i = 0; i < operatorArr.length; i++) {
            char operator = operatorArr[i];
            long n = Long.parseLong(numberArr[i + 1]);

            if (operator == '+') {
                result += n;
            } else {
                result -= n;
            }
        }
        return result;
    }
}