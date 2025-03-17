import java.util.ArrayList;
import java.util.Scanner;

public class a005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        int lines = scanner.nextInt();
        if (lines > 20 || lines < 0) {
            System.out.println("err lines");
            scanner.close();
            return;
        }
        for (int i = 1; i <= lines; i++) {
            int[] arr = new int[3];
            for (int j = 0; j <= 3; j++) {
                arr[j] = scanner.nextInt();
            }
            int fifth;
            if (arr[1] - arr[0] == arr[2] - arr[1]) {
                int diff = arr[1] - arr[0];
                fifth = arr[3] + diff;
            } else {
                int ratio = arr[1] / arr[0];
                fifth = arr[3] * ratio;
            }

            for (int j = 0; j <= 4; j++) {
              System.out.print(arr[j] + " ");
            }
            System.out.println(fifth);
          
        }

        scanner.close();      
    }
}