package com.antonakospanos.oca.exam.java8certificationquestions;

public class InstaceOfEvaluation {
	
	public static void evaluateArray() {
		int[] intArray = {}; // Array or primitive date is an object!
		
		if (intArray instanceof Object) {
			// code
		}
	}
	
	public static void evaluateInteger() {
		int i;							 // int is a primitive datatype: NOT an object -> Compilation Error in instanceOf
		
//		if (i instanceof Object) {
//			// code
//		}
	}
}