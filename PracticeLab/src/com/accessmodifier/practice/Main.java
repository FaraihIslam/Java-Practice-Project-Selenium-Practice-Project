package com.accessmodifier.practice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PublicDemo pd = new PublicDemo();
		pd.publicMethod();

		System.out.println("--------------------");

		DefaultDemo dd = new DefaultDemo();
		dd.defaultMethod();

		System.out.println("---------------------");

		
		PrivateDemo pr=new PrivateDemo();
		

	}

}
