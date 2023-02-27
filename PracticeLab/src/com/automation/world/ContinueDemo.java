package com.automation.world;

public class ContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i=1;i<=5;i++) {
			System.out.println("value of i is:"+i);
			if(i==3) {
			continue;
			}
			System.out.println(i);
		}
/*		System.out.println("-----------------");
		
		for(int j=20;j<=25;j++) {
			if(j==23) {
				continue;
			}
			System.out.println("Value of j is:"+j);
		}*/

	}

}
