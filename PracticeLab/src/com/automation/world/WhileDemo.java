package com.automation.world;

public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		int num1=20;
/*		while(num<=10) {
			System.out.println("Welcome to Java Programming-"+num);
			num++;
		}*/
		
/*		while(++num > --num1);
			System.out.println("Without body");*/
		
		while(++num < --num1) {
			System.out.println("Value of num is:"+num+" and Value of num1 is:"+num1);
		}

	}

}
