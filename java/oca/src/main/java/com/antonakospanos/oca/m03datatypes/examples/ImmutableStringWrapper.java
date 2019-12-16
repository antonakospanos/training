package com.antonakospanos.oca.m03datatypes.examples;

public class ImmutableStringWrapper {
	
	private String immutableString;
	
	public ImmutableStringWrapper(String s) {
		this.immutableString = s;
	}
	
	public String getString() {
		return immutableString;
	}
	public String toLowerCase() {
		return this.immutableString.toLowerCase();
	}
	
	public static void testImmutableStringWrapper() {
		ImmutableStringWrapper immutableStringWrapper = new ImmutableStringWrapper("I am an immutable Object");
		System.out.println(immutableStringWrapper.getString());
		immutableStringWrapper.toLowerCase();
		System.out.println(immutableStringWrapper.getString());
	}
}
