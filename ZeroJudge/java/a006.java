package ZeroJudge;

import java.util.Scanner;

public class a006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] strings = input.split("\\s+");
        int a = Integer.parseInt(strings[0]);
        int b = Integer.parseInt(strings[1]);
        int c = Integer.parseInt(strings[2]);
        double r = (b * b) - (4 * a * c);
        int x, x1, x2;

        if (a != 0) {
            x1 = (int) (-b + Math.sqrt(r)) / (a * 2);
            x2 = (int) (-b - Math.sqrt(r)) / (a * 2);

            if (x1 > x2) {
                System.out.println("Two different roots " + "x1=" + x1 + " , x2=" + x2);
            } else if (x1 < x2) {
                System.out.println("Two different roots " + "x1=" + x2 + " , x2=" + x1);
            } else if (r == 0) {
                System.out.println("Two same roots x=" + x1);
            } else {
                System.out.println("No real root");
            }
        }
        sc.close();
    }
}
