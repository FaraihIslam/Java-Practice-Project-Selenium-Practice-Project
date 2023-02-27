package com.inheritance.practice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calling All methods of Parent and Child Class
		Parent p=new Parent();
		p.parentMethod1();
		p.parentMethod2();
		
		System.out.println("----------------------");
		
		Child c=new Child();
		c.childMethod1();
		c.childMethod2();
		c.parentMethod1();
		c.parentMethod2();

	}

}
