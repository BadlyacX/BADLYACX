import java.util.ArrayList;
import java.util.Scanner;

public class a005 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            String input = scanner.nextLine();

            String[] strings = input.split(" ");

            ArrayList<Integer> array = new ArrayList<>();

            for (int i = 0; i < 4; i++) {
                array.add(Integer.parseInt(strings[i]));
            }

            if (array.get(0) - array.get(1) == array.get(1) - array.get(2)) {
                int common_difference = array.get(0) - array.get(1);
                if (array.get(2) - array.get(3) != common_difference) {
                    return;
                }
                array.add(array.get(3) - common_difference);
                System.out.println(array.get(0) + " " + array.get(1) + " " + array.get(2) + " " + array.get(3) + " " + array.get(4) + " ");
            }

            if (array.get(1) / array.get(0) == array.get(2) / array.get(1)) {
                int common_ratio = array.get(1) / array.get(0);
                if (array.get(3) / array.get(2) != common_ratio) {
                    return;
                }
                array.add(array.get(3) * common_ratio);
                System.out.println(array.get(0) + " " + array.get(1) + " " + array.get(2) + " " + array.get(3) + " " + array.get(4) + " ");
            }
        }
        scanner.close();
    }
}
