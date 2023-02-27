package com.automation.world;

public class OverloadingDemo {
	
	public void hello() {
		System.out.println("Hello with no parameters");
	}
	
	public void hello(int a) {
		System.out.println("Hello with single parameters "+a);
	}
	public void hello(int a,int b) {
		System.out.println("Hello with double parameters "+a+","+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingDemo ol=new OverloadingDemo();
		ol.hello();
		ol.hello(10);
		ol.hello(10, 20);
		

	}

}
