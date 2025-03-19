package ZeroJudge;

import java.util.Scanner;
import java.util.HashMap;

public class a009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int k = 7;
        String input = sc.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int n = (int) c;
            char o = (char)(n - k);
            System.out.print(o);
        }
        sc.close();
    }
}