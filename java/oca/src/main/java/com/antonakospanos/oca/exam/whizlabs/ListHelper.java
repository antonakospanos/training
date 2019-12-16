package com.antonakospanos.oca.exam.whizlabs;

import java.util.ArrayList;
import java.util.List;

public class ListHelper {
	
	public static void removeOdds (List<Integer> list) {
		if (list != null) {
			list.removeIf(i -> i%2 != 0);
			System.out.println(list);	
		}
	}
	
	public static void removeEvens (List<Integer> list) {
		if (list != null) {
			list.removeIf(i -> i%2 == 0);
			System.out.println(list);	
		}
	}
	
	public static void crateDummyList() {
		List list = new ArrayList(1);
		list.add(5);
		list.add("A");
		list.add(new Integer(5));
		System.out.println(list);
	}
}
