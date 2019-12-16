package com.antonakospanos.oca.m10apis.examples;

public class StringBuilderManipulation {
	
	public static StringBuilder getHelloWorld() {
		StringBuilder s = new StringBuilder(100);
		s.append("Hello");
		
		String tmp = "this is the world calling";
		s.append(tmp, 11, 17);
		System.out.println(s);
		
		return s;
	}
	
	public static void deleteWord(StringBuilder s, int start, int end) {
		s.delete(start, end);
		System.out.println(s);
	}
	
	public static void insertStringRepresentation(StringBuilder s, int start, Object obj) {
		s.insert(start, obj);
		System.out.println(s);
	}
	
	public static void replaceStringBuffer(StringBuilder s, int start, int end, String replacement) {
		s.replace(start, end, replacement);
		System.out.println(s);
	}
	
	public static void reverseStringBuffer(StringBuilder s) {
		s.reverse();
		System.out.println(s);
	}
	
	public static void changeChar(StringBuilder s, int index, char ch) {
		s.setCharAt(index, ch);
		System.out.println(s);
	}
	
	public static void truncateStringBuffer(StringBuilder s, int end) {
		s.setLength(end);
		System.out.println(s);
	}
	
	public static String getSubString(StringBuilder s, int start) {
		return getSubString(s, start, s.length());
	}
	
	public static String getSubString(StringBuilder s, int start, int end) {
		String substring = s.substring(start, end);
		System.out.println(s);
		
		return substring;
	}
	
	public static char getChar(StringBuilder s, int index) {
		char c = s.charAt(0);
		System.out.println(s);
		
		return c;
	}
	
	public static void copyChars(StringBuilder s, int start, int end, char[] dest, int destOffset) {
		s.getChars(start, end, dest, destOffset);
		System.out.println(s);
	}
	
	public static int firstIndexOf(StringBuilder s, String word) {
		int index = s.indexOf(word);
		System.out.println(s);
		
		return index;
	}
	
	public static int lastIndexOf(StringBuilder s, String word) {
		int index = s.lastIndexOf(word);
		System.out.println(s);
		
		return index;
	}
	
	public static int getCapacity(StringBuilder s) {
		int capacity = s.capacity();
		System.out.println(s);
		
		return capacity;
	}	
	
	public static void ensureCapacity(StringBuilder s, int capacity) {
		s.ensureCapacity(capacity);
		System.out.println(s);
	}	
	
	public static void trimCapacity(StringBuilder s) {
		s.trimToSize();
		System.out.println(s);
	}	
	
}