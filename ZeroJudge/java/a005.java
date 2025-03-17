import java.util.ArrayList;
import java.util.Scanner;

public class a005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int lines = scanner.nextInt();
        if (lines > 20 || lines < 0) {
            System.out.println("err lines");
            scanner.close();
            return;
        }
        for (int i = 1; i <= lines; i++) {
            String input = scanner.nextLine();
            input
        }
            
        scanner.close();      
    }
}
