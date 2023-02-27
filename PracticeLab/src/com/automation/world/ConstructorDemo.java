package com.automation.world;

public class ConstructorDemo {
	
	int a;
	int b;
	
	public ConstructorDemo(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public void display() {
		System.out.println(a);
		System.out.println(b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo cd=new ConstructorDemo(5,10);
		cd.display();
		

	}

}
