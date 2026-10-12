package com.mcu.JavaProj_20261012a;

public class TestJava_20261012a {
	
	public int[] g = new int[5];
	
	int[] test;{
	test = new int[5];
	test[0] = 1;
	test[1] =2;
	test[2] =3;
	test[3] =4;
	test[4] =5;
	System.out.println();
	}
	int a = 5;{
		a++;
	}
	
	int[] test1 = new int[5];
	
	public static void main(String[] args) {
		int x = 2, y = 3, z = 3;
		z *= x + y;
		System.out.println(z);
	//	m1();
	//	m2();
	//	m3();
	}
	
	private static void m1() {
		System.out.println("Hello, This is m1()");
		int x = 5;
		int a = x++;
		System.out.println("x: " + x +", a: " + a);
	}
	
	private static void m2() {
		System.out.println("Hello, This is m2()");
		int y = 5;
		int b = ++y;
		System.out.println("y: " + y + ", b: " + b);
	}
	
	private static void m3() {
		System.out.println("Hello, This is m3()");
		int z = 5;
		int c = 3;
		int d = (z += c);
		System.out.println("z: " + z + ", d: " + d);
	}
}
