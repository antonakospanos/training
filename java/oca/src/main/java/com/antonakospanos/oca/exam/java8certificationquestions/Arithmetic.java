package com.antonakospanos.oca.exam.java8certificationquestions;

public class Arithmetic {

	public static void playWithBinaries() {
		
		int one = 0b01;
		int two = 0b10;
		int thirtyTwo = 0b100000; // 2^5
		int fortyTwo = 0b101010; // 2^5 + 2^3 + 2^1
		
		System.out.println(Integer.toString(one));
		System.out.println(Integer.toString(two));
		System.out.println(Integer.toString(thirtyTwo));
		System.out.println(Integer.toString(fortyTwo));
	}

	public static void playWithOctals() {
		
		int one = 0000001;
		int two = 0000002;
		int thirtyTwo = 0000040; // 4*8^1
		int fortyTwo = 0000052; // 5*8^1 + 2*8^0
		
		System.out.println(Integer.toString(one));
		System.out.println(Integer.toString(two));
		System.out.println(Integer.toString(thirtyTwo));
		System.out.println(Integer.toString(fortyTwo));
	}

	public static void playWithdDecimals() {
		
		int one = 1;
		int two = 2;
		int thirtyTwo = 32;
		int fortyTwo = 42;
		
		System.out.println(Integer.toString(one));
		System.out.println(Integer.toString(two));
		System.out.println(Integer.toString(thirtyTwo));
		System.out.println(Integer.toString(fortyTwo));
	}

	public static void playWithHexs() {
		
		int one = 0x001;
		int two = 0x002;
		int thirtyTwo = 0x0020; // 2*16^1 + 0*16^0
		int fortyTwo = 0x002a; // 2*16^1 + 10*16^0
		
		System.out.println(Integer.toString(one));
		System.out.println(Integer.toString(two));
		System.out.println(Integer.toString(thirtyTwo));
		System.out.println(Integer.toString(fortyTwo));
	}
}