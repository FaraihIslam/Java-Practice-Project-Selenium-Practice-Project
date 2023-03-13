package com.collection.practice;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al=new ArrayList<>();
		al.add("Bucati");
		al.add("Porsche");
		al.add("Ferrari");
		al.add("BMW");
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.get(1));
		al.set(3,"Ford");
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		System.out.println(al.get(2));
		al.removeAll(al);//we can use clear() also for removing all ArrayList elements
		System.out.println(al);

	}

}
