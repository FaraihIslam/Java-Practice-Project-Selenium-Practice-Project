package com.automation.world;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month=Integer.parseInt(args[0]);
		
		String season="";
		switch(month)
		{
			case 1: 
			case 2:
			case 3:
				season="Winter";
				break;
			case 4:
			case 5:
			case 6: 
				season="Summer";
				break;
			case 7: 
			case 8:
			case 9:
				season="Rainy";
				break;
			case 10: 
			case 11:
			case 12: 
				season="Spring";
				break;
				default:
					System.out.println("Invalid Month");
			
		}
			

	}

}
