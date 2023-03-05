package com.automation.world;

public abstract class AbstractDemo {
	
	public abstract void method1();
	public void method2() {
		System.out.println("Method 2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Abstract Class not allow to create the Object of class(we can't instantiate due to partial implementation)
		//AbstractDemo ad=new AbstractDemo();

	}

}
