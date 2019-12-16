package com.antonakospanos.oca.m10apis.examples;

public class StringManipulation {
	
	public static String getNewUpperCaseString(String s) {
		String newString = s.toUpperCase();
		
		System.out.println(s);
		
		return newString;
	}
	
	//  Mostly equivalent methods to get String representation
	public static String getString(Object obj) {
		return String.valueOf(obj);
	}
	public static String getStringRepresentation(Object obj) {
		return obj.toString();
	}
	
	public static String getConcatenatedString(String s1, String s2) {
		String concatenated = s1 + s2;
		// String concatenated = s1.concat(s2);
		
		return concatenated;
	}
	
	public static String getTrimmedString(String s) {
		return s.trim();
	}
	
	public static String getReplacedString(String s, String oldWord, String newWord) {
		return s.replace(oldWord, newWord);
	}
}
