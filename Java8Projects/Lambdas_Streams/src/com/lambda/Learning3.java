package com.lambda;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;

public class Learning3 {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		
		set.add("ABC");
		set.add(new String("ABC"));
		
		System.out.println(set);
		
		String a = "ABC";
		String b = new String("ABC");
		
		String c = new String(a);
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		if(a == b) {
			System.out.println("a = b");
		}
		
		if(a.equals(b)) {
			System.out.println("a equals c");
		}
		
		Hashtable hashTable = new Hashtable();
		
		hashTable.put("2", "a");
		hashTable.put(3, "a");
		hashTable.put(4, "a");
		hashTable.put(5, "a");
		
		List aa = Arrays.asList("1","2","3");
		
		aa.forEach(x->System.out.println(x));
		
		BiConsumer l = (x,y)->System.out.println(x+""+y);
		
		hashTable.forEach(l);
		
		System.out.println();
		
	}

}

