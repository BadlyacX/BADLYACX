package ZeroJudge;

import java.util.Scanner;

public class a005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        int a = 0;
    while (sc.hasNext()) {
        if (a == t) {
            break;
        }

        String line = sc.nextLine();
        String[] strings = line.split("\\s+");
        int[] numbers = new int[strings.length];

        for (int i = 0; i < strings.length; i++) {
            numbers[i] = Integer.parseInt(strings[i]);
        }

        int fifth;
        if (numbers[1] - numbers[0] == numbers[2] - numbers[1]) {
            int diff = numbers[1] - numbers[0];
            fifth = numbers[3] + diff;
        } else {
            int ratio = numbers[1] / numbers[0];
            fifth = numbers[3] * ratio;
        }

        for (int i = 0; i <= 3; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(fifth);

        a++;
    }

        sc.close();
    }
}
