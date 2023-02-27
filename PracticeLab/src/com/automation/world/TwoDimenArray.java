package com.automation.world;

public class TwoDimenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][];
		array=new int[4][5];
		int k=0;
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<5;j++) {
				array[i][j]=k;
				System.out.println("Value of Array is["+i+"]["+j+"] is:"+array[i][j]);
				k++;
			}System.out.println("------------------------------");
		}

	}

}
