package com.automation.world;

public class ScopeOfVariableDemo {
	
	 int a=10;
	 static int f=30;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScopeOfVariableDemo s=new ScopeOfVariableDemo();
		int b=15;//It is access within the main method
		System.out.println("Value of a is :"+s.a);
		System.out.println("Value of b is :"+f);
		if(s.a==10) {
			int c=20;
			System.out.println("Value of c is :"+c);
		}
		System.out.println("Value of b is :"+b);
	//	System.out.println(c);// we can't access local variable outside the block

	}
	public static void m1() {
		int e=45;
	System.out.println("Value of b is :"+e);
	System.out.println("Value of f is :"+f);
	//System.out.println("Value of b is :"+a);// Variable will not hold the value, once it is out of scope
	
	}

}
