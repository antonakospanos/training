package com.antonakospanos.oca.m03datatypes.examples;

public class AutoBoxing {
	
	private static int primitive = 10;
	private static Integer objWrapper;
	
	public static void testAutoBoxing () {
		objWrapper = new Integer(primitive);
		objWrapper = primitive; // auto-boxing primitive to Integer Object
		System.out.println("Auto-boxed: " + objWrapper);
		
		primitive = objWrapper.intValue();
		primitive = objWrapper; // auto-unboxing primitive from Integer Object
		System.out.println("Auto-unboxed: " + primitive);
	}
}
