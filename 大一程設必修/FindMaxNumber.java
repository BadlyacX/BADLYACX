package com.mcu.javaProj__20261001.大一程設;

public class FindMaxNumber {
    public static void main(String[] args) {
        int numbers[] = {60, 10, 20 ,30, 40, 50};
        System.out.println(findMaxNumber(numbers));
    }

    private static int findMaxNumber(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++)
             max = numbers[i] > max ? numbers[i] : max;
             // max = Math.max(max, numbers[i]);
        return max;
    }
}
