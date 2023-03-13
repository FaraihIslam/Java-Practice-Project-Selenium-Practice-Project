package com.collection.practice;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> hm = new HashMap<>();
		hm.put("India", "New Delhi");
		hm.put("Sri Lanka", "Colombo");
		hm.put("Norway", "Oslo");
		hm.put("Japan", "Tokyo");

		System.out.println("-------HashMap Key---------");

		for (String name : hm.keySet()) {
			System.out.println(name);
		}

		System.out.println("-------HasMap Values-------");

		for (String names : hm.values()) {
			System.out.println(names);
		}

		System.out.println("-------HashMap Key-Value-------");

		for (Entry<String, String> name1 : hm.entrySet()) {
			System.out.println(name1);
		}

		System.out.println("--------------------");

		for (String name2 : hm.keySet()) {
			System.out.println(name2 + "," + hm.get(name2));
		}
	}

}
