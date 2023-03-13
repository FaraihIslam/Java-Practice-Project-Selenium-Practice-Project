package com.collection.practice;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al=new ArrayList<>();
		al.add("Bucati");
		al.add("Porsche");
		al.add("Ferrari");
		al.add("BMW");
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		for(String car:al) {
			System.out.println(car);
		}

	}

}
