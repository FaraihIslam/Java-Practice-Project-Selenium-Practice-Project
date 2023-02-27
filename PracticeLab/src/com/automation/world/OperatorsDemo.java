package com.automation.world;

public class OperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		incrementOperator();
		plusOperator();
		logicalOperator();

	}
	public static void incrementOperator() {
		int a=4;
		++a;
		System.out.println(a);
		int b=8;
		b++;
		System.out.println(b);
		
	}
	public static void plusOperator() {
		String name="Faraih";
		String name1="Islam";
		System.out.println(name+name1);
		
		int a=123;
		int b=2345;
		System.out.println(a+b);
		
		String name2="abcd";
		String number="123";
		System.out.println(name2+number);
		
	}
	@SuppressWarnings("unused")
	public static void logicalOperator() {
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && false);
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || false);
	}
	public static void relationalOperator() {
		int a=20;
		int b=30;
		System.out.println(a<b);
		System.out.println(a>b);
	}

}
