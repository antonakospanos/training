package com.antonakospanos.oca.exam.oracle;

public class Love {
	
	public static void find() {
		System.out.println("------------------- Starting Love.find() method.. -------------------");

		StringBuilder sb = new StringBuilder("Java");
		String s = "Love";
		sb.append(s);
		sb.substring(4); // returns the substring after the 4th char in a new String object/pointer..!
		
		int loveIsFoundAt = sb.indexOf(s);
		System.out.println(sb);	// Prints JavaLove

		System.out.println(loveIsFoundAt);
	}
}
