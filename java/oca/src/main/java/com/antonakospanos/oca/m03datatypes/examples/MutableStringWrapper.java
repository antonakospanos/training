package com.antonakospanos.oca.m03datatypes.examples;

public class MutableStringWrapper {

	private String mutableString;
	
	public MutableStringWrapper(String s) {
		this.mutableString = s;
	}
	
	public MutableStringWrapper() {
		this.mutableString = "";
	}
	
	public String getString() {
		return mutableString;
	}
	public void toLowerCase() {
		this.mutableString = mutableString.toLowerCase();
	}
	
	public static void testMutableStringWrapper() {
		MutableStringWrapper mutableStringWrapper = new MutableStringWrapper("I am a mutable Object");
		System.out.println(mutableStringWrapper.getString());
		mutableStringWrapper.toLowerCase();
		System.out.println(mutableStringWrapper.getString());
	}
}
