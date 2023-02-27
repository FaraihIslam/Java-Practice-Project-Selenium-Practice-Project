package com.automation.world;

public class LargestNumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 85;
		int b = 75;
		int c = 95;
		if (a >= b && a >= c) {
			System.out.println(a + " is biggest no");
		}
		if (b >= c && b >= a) {
			System.out.println(b + " is biggest no");
		}
		if (c >= a && c >= b) {
			System.out.println(c + " is biggest no");
		}
	}

}
