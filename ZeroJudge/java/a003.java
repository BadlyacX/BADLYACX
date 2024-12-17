import java.util.Scanner;

public class a003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] strings = input.split(" ");
        int m = Integer.parseInt(strings[0]);
        int d = Integer.parseInt(strings[1]);
        int s = (m*2+d) % 3;

        switch (s) {
            case 0:
                println("普通");
                break;
            case 1:
                println("吉");
                break;
            case 2:
                println("大吉");
                break;
        }
    }
    public static void println(String s) {
        System.out.println(s);
    }
}
