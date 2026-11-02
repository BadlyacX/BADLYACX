public class TestJava_studentId_YYYYmmdd {

	public static void main(String[] args) {
        int[] numbers = {25, 8, 46, 12, 39};
		int min = finMin(numbers);
        System.out.println("最小值：" + min);

		int max = finMax(numbers);
        System.out.println("最大值：" + max);

        numbers = new int[]{26, 9, 49, 11, 38};
        int[] valArr = finMinMax(numbers);
        System.out.print("最小值：" + valArr[0]);
        System.out.println("  最大值：" + valArr[1]);

	}

	static int finMin(int[] numbers) {
		int min = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			min = Math.min(min, numbers[i]);
		}
		return min;
	}
	
	static int finMax(int[] numbers) {
		int max =  numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			max = Math.max(max, numbers[i]);
		}
		return max;
	}

	static int[] finMinMax(int[] numbers) {
		int[] nArr = {finMin(numbers), finMax(numbers)};
		return nArr;
	}

	/*
	 * 試題說明
	 * 注意：在main(...)中，除了添加註解外，不能再添加任何程式碼
	 * 
	 * 請在本檔案的適當位置中添加程式碼，
	 * 使得既有的main(...)方法執行之後會有如下之輸出：
		 最小值：8
	     最大值：46
	     最小值：9  最大值：49
	 */
}
