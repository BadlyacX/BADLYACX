package ZeroJudge;

import java.util.ArrayList;
import java.util.Scanner;

public class a005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int lines = scanner.nextInt();
        for (int i = 1; i <= lines; i++) {
    

            int fifth;

            if (list.get(1) - list.get(0) == list.get(2) - list.get(1)) {
                int diff = list.get(1) - list.get(0);
                fifth = list.get(3) + diff;
            } else {
                int ratio = list.get(1) / list.get(0);
                fifth = list.get(3) * ratio;
            }

            for (int j = 0; j <= 4; j++) {
                System.out.print(list.get(j) + " ");
            }
            System.out.println(fifth);

        }

        scanner.close();
    }
}
