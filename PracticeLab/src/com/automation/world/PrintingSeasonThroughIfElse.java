package com.automation.world;

public class PrintingSeasonThroughIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month=Integer.parseInt(args[0]);
		if(month>=1 && month<=3) {
			System.out.println("Winter Season");
		}else if(month>=4 && month<=6) {
			System.out.println("Summer Season");
		}else if(month>=7 && month<=9) {
			System.out.println("Rainy season");
		}else
			System.out.println("Spring season");

	}

}
