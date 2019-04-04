package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Learning2 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,2,5,3,4,7,5);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		HashMap newMap = new HashMap();
		
		Set newList = new HashSet();
		
		Set linked = new HashSet(list);
		
		/*
		 * for(Integer i : list) { if(!linked.add(i)) { newList.add(i); } }
		 */
		
		for (Integer yourInt : list)
		{
			if (!linked.add(yourInt)){ 
				newList.add(yourInt);
			}
		}
		
		boolean a = newList.add("1");
		
		System.out.println(newList);
		
		list = new ArrayList(linked);
		
		System.out.println(list);
		
	}

}

