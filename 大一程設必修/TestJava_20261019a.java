public class TestJava_20261019a {
	
	private static int add(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		
		System.out.printf("The result is: %s %s", add(100, 50), "\n");
		
		int i = 1;
		while (i <= 5) {
			System.out.print(i + " ");
			i++;
		}
		
	
		do {
			System.out.print("\n" + i);
		} while (i <= 5);
	}

}
