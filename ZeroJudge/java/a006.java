package ZeroJudge;

import java.util.Scanner;
import java.util.ArrayList;

public class a006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> factors = new ArrayList<>();
        String input = sc.nextLine();
        String[] strings = input.split("\\s+");
        int a = Integer.parseInt(strings[0]);
        int b = Integer.parseInt(strings[1]);
        int c = Integer.parseInt(strings[2]);

        for (int i = 1; i <= c; i++) {
            if (c % i == 0) {
                factors.add(i);
                System.out.println(i);
            }
        }

        
        
// 1 2 5 10
        // ax^2 + bx + c = 0
        // sample input 1 3 -10
        // x^2 + 3x - 10 = 0
        // (x + 5) (x -2) = 10
        sc.close();
    }
}
