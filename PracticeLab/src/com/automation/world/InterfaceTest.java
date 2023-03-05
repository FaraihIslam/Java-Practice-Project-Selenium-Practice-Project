package com.automation.world;

interface InterfaceDemo {
	
	public abstract void method1();
	public abstract void method2();
	
	//when we don't know about implementation then we should go for Interface
	//In this case child class is responsible for implementation
}
	
	
public class InterfaceTest implements InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

}
