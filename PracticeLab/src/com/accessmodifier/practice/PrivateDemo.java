package com.accessmodifier.practice;

public class PrivateDemo {
	
	private int a=20;
	
	 
	private void prvateMethod1() {
		System.out.println("Private access modifier "+a);
	}
	 public static void main(String[]args) {
		 PrivateDemo pr=new PrivateDemo();
		 pr.prvateMethod1();
		System.out.println(pr.a);
	 
	 }

}
