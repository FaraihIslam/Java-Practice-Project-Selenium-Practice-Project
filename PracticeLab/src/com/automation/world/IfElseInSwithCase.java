package com.automation.world;

public class IfElseInSwithCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=20;
		int y=40;
		if(x>y) {
			x=1;
			
		}else
			x=2;
			
			switch(x) {
			case 1:
				System.out.println("X is greater than Y");
			case 2:
				System.out.println("X is smaller than Y");
			}

	}

}
