import java.util.Scanner;

public class a004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder output = new StringBuilder();

        while (scanner.hasNextInt()) {
            int year = scanner.nextInt();
            if (isLeapYear(year)) {
                output.append("閏年\n");
            } else {
                output.append("平年\n");
            }
        }

        System.out.print(output);
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
