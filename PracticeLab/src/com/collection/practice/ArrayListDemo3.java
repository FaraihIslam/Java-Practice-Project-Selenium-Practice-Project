package com.collection.practice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(40);
		al.add(30);
		al.add(20);
		
		for(int num:al) {
			System.out.println(num);
		}
		
		Collections.sort(al);
		System.out.println("--------After Sorting-------");
		
		for(int number:al) {
			System.out.println(number);
		}

	}

}
