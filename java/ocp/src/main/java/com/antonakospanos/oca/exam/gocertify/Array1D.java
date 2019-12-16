package com.antonakospanos.oca.exam.gocertify;

public class Array1D {

	public Array1D() {
		Integer[] intArray = new Integer[0]; // init intArray with an EMPTY (size=0) Integer Array!
		
		// Throws java.lang.ArrayIndexOutOfBoundsException, as there is not element in the first index of the array
		// System.out.println(intArray[0]);
		
		for (int i : intArray) {
			System.out.println("intArray["+i+"] = " + intArray[i]);
		}
	}
}