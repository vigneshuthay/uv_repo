package com.lambda;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Learning4 {

	public static void main(String[] args) {

		//zhashMapExample();
		
	}

	public static void zhashMapExample() {
		HashMap newMap = new HashMap();
		newMap.put("KEY1", 1);
		newMap.put("KEY2", 1);
		newMap.put("KEY3", 1);
		newMap.put("KEY4", 1);
		newMap.put("KEY5", 1);
		HashSet hashSet = new HashSet();
		System.out.println(newMap);
		Set<Map.Entry> a = newMap.entrySet();
		for(Entry entry : a) {
			System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
			hashSet.add(entry.getValue());
		}
		System.out.println(hashSet);
	}

	/*
	 * @Override public void zgetNames() { System.out.println("vignesh , uthay"); }
	 */

}

