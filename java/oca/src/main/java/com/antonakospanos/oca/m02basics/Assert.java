package com.antonakospanos.oca.m02basics;

public class Assert {
	
	private static int var;
	
	public static void testAssert(int arg) {
		assert var == arg; // Asserted in case we run execute the program in the JVM with '-ea' or '-enableassertions' command line switch
	}
}
