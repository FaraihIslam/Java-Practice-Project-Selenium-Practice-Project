package com.automation.world;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    String days[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	    System.out.println(days[0]);
	    System.out.println("--------------");
	    for(String dayName:days) {
	    	System.out.println(dayName);
	    }
	    System.out.println("-------------");
	    int nums[];
	    nums=new int[4];
	    nums[0]=50;
	    nums[1]=60;
	    nums[2]=70;
	    nums[3]=80;
	    for(int i=0;i<nums.length;i++) {
	    	System.out.println(nums[i]);
	    }
		

	}

}
