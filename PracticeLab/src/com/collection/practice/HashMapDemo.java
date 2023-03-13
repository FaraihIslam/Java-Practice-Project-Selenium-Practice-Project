package com.collection.practice;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String> hm=new HashMap<>();
		hm.put("India", "New Delhi");
		hm.put("Sri Lanka", "Colombo");
		hm.put("Norway", "Oslo");
		hm.put("Japan", "Tokyo");
		
		System.out.println(hm);
		hm.remove("Sri Lanka");
		System.out.println(hm);
		System.out.println(hm.size());
		hm.clear();
		System.out.println(hm);
		
		//HashMap use in RealTime Environment
		
	/*	hm.put("SIT", "www.sit.com");
		hm.put("UAT", "www.uat.com");
		hm.put("PROD", "www.prod.com");*/
	}

}
