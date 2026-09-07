public class TestJava___20260907a {
	
	private static final String name = "Gary";
	private static final String[] subjects = {"國", "英", "數", "自", "社"};
	
	public static void main(String[] args) {
		
		println("Hello Teacher");
		println("My name is " + name);
		
		// {國, 英, 數, 自, 社}
		int[] student1 = {90, 80, 70, 60, 50};
		int[] student2 = {50, 60, 70, 40, 30};
		
		println("學生1 這學期成績" + passOrNot(student1));
		println("學生2 這學期成績" + passOrNot(student2));
	}
	
	public static String passOrNot(int[] score) {
		int a = 0;
		
		for (int i = 0; i < score.length; i++) {
			System.out.println(subjects[i] + ": " + score[i]);
			a += score[i];
			
		}
		
		int result = a / 5;
		
		if (result >= 60) {
			return "平均: " + result + " 結果: 及格";
		} else {
			return "平均: " + result + " 結果: 不及格";
		}
		
	}
	
	public static void println(String msg) {
		System.out.println(msg);
	}
	
	public static void println(int msg) {
		System.out.println(msg);
	}
}
