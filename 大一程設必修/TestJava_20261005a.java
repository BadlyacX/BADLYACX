public class TestJava_20261005a {

	public static void main(String[] args) {
		int[] xarr = new int[30];
		xarr[0] = 29;
		xarr = new int[35];
		xarr[34] = 78;
		
		// System.out.println(xarr[0]);
		// System.out.println(xarr[34]);
		
		int[] yarr;
		yarr = xarr;
		
		// System.out.println(yarr[34]);
	
		for (int i = 0; i < 10; i++) {
			// System.out.println(i);
		}
		
		for (int i = 0; i < xarr.length; i++) {
			// System.out.println(i);
		}
		
		int[] zarr = new int[] {1, 2, 3, 4, 5};
		for (int x : zarr) {
			//System.out.println(x);
		}
		
		int[] warr = new int[3];
		for (int val : warr) {
			// System.out.print(val);
		}
	}
} 
