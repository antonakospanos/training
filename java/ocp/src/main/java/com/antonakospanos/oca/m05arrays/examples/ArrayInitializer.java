package com.antonakospanos.oca.m05arrays.examples;

public class ArrayInitializer {
	
	public static void initializeWithSystemCopy(int[] from, int[] to) {
		System.arraycopy(from,0, to, 0, from.length);
		for (int integer : to) {
			System.out.println(integer);
		}
		System.out.println("Initialized array using System.arraycopy method");
	}
	
	public static void initializeWithTraditionalForLoop(int[][] arrayOfArraysOfInts) {
		int initializer = 0;
		for (int[] arrayOfInts : arrayOfArraysOfInts) {
			for (int i = 0; i < arrayOfInts.length ; i++) {
				arrayOfInts[i] = ++initializer;
			}
			for (int integer : arrayOfInts) {
				System.out.println(integer);
			}
		}
		System.out.println("Initialized array using traditional for loop");
	}
	
	public static void manipulateWithForEachLoop(int[][] arrayOfArraysOfInts) {
		int initializer = 0;
		for (int[] arrayOfInts : arrayOfArraysOfInts) {
			for (int localVariable : arrayOfInts) {	// localVariable is just a copy of arrayOfInts[i]
				localVariable = ++initializer;				// Assignment of primitive data types always copy the bits representing the value of the old variable to another variable
			}
			for (int integer : arrayOfInts) {
				System.out.println(integer);
			}
		}
		System.out.println("Iterated array using enhanced for loop");
	}
	
	public static void manipulateWithForEachLoop(Integer[][] arrayOfArraysOfInts) {
		int initializer = 0;
		for (Integer[] arrayOfInts : arrayOfArraysOfInts) {
			for (Integer localVariable : arrayOfInts) {
				localVariable = ++initializer;
			}
			for (Integer integer : arrayOfInts) {
				System.out.println(integer);
			}
		}
		System.out.println("Iterated array using enhanced for loop");
	}
}