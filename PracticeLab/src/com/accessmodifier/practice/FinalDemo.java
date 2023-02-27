package com.accessmodifier.practice;

 class Test {
	 
	 final int num=20;

	final void finalMethod() {
		System.out.println("Example of Final access modifeir");
	//	System.out.println(num=45);
	}

	public void finalMethod1() {
		System.out.println("Example of Final access modifeir");
	}

}

public class FinalDemo extends Test {
	
/*	public void finalMethod() {
		
	}*/

	public static void main(String[] args) {

	}

}
