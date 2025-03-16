package Practice.Lambda;

public class LambdaPractice {
    public static LambdaPractice lambdaPractice = new LambdaPractice();

    interface MathOperation {
        int operation(int a, int b);
    }

    MathOperation add = Integer::sum;

    public static void main(String[] args) {
        System.out.println(lambdaPractice.add.operation(1, 2));
    }
}
