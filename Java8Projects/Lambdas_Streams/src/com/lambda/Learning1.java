package com.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class Learning1 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,3,4,5,6,2,5,3,4,7,5);

		Collections.sort(list);

		System.out.println(list);

		Set newSet = new HashSet(list);

		System.out.println(newSet);

		HashMap tree = new HashMap();

		tree.put("D", "Fourth");
		tree.put("E", "Fifth");
		tree.put("F", "Sixth");
		tree.put("C", "Third");
		tree.put("A", "First");
		tree.put("B", "Second");
		tree.put("A", "First1");
		tree.put("A", "First2");

		System.out.println(tree);
		
		System.out.println(findDuplicates(list));
		
		Set<Integer> st = new HashSet<Integer>(list);
        for (Integer s : st) 
            System.out.println(s + ": " + Collections.frequency(list, s));
        
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,2,5,3,4,7,5);
        
        Collections.sort(list1);
        
        TreeMap<Integer,Integer> treeMap = new TreeMap<Integer,Integer>();
        
        System.out.println("aaa");
        
        for(Integer i : list1) {
        	int c = 0;
        	if(treeMap != null) {
        		c = treeMap.get(i);
        	}
        	System.out.println("aaaaaa");
        	treeMap.put(i, (c == 0) ? 1 : c + 1); 
        }
        
        System.out.println(treeMap);

	}

	public static Set<Integer> findDuplicates(List<Integer> listContainingDuplicates)
	{ 
		final Set<Integer> setToReturn = new HashSet<>(); 
		final Set<Integer> set1 = new HashSet<>();
		int value = 0;
		HashMap hashMap = new HashMap();
		int count = 0;
		for (Integer yourInt : listContainingDuplicates)
		{
			if (!set1.add(yourInt)){ 
				setToReturn.add(yourInt);
			}
		}
		System.out.println(hashMap);
		return setToReturn;
	}

}

