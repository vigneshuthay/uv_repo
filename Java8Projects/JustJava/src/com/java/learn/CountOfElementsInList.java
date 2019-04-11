package com.java.learn;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountOfElementsInList {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,2,4,2,1,5,6,3,4);
		
		Set<Integer> set1 = new HashSet<Integer>(list);
		System.out.print("{");
		for(Integer i : set1) {
			System.out.print(" "+i+"="+Collections.frequency(list,i)+",");
		}
		System.out.print("}\n");
		
		Set<Integer> set = new HashSet<Integer>();
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int count = 0;
		Collections.sort(list);
		for(Integer i : list) {
			if(!set.add(i)) {
				count ++;
				map.put(i,count);
			}else {
				count = 1;
				map.put(i,count);
			}
		}
		System.out.println(map);
		
	}

}

