package com.antonakospanos.oca.exam.whizlabs;

import java.util.function.Predicate;

public class LambdaWithoutArgs {
	
	public static void evaluate() {
		
		Runnable r1 = () -> {System.out.println("Run!");};	// Lamda without any args!
		Runnable r2 = () -> System.out.println("Run!");			// Lamda without any args!
		
		Predicate<String> containsA0 = s -> s.indexOf("a") > 0;
		Predicate<String> containsA1 = s -> { return s.indexOf("a") > 0; };
		Predicate<String> containsA2 = (String s) -> { return s.indexOf("a") > 0; };
		// INVALID cause argList must be encapsulated in parenthesis in case of multiple words 
		// Predicate<String> containsA3 = String s -> { return s.indexOf("a") > 0; };

		// INVALID cause return statements must be encapsulated in curling braces and vice verca!
		// Predicate<String> containsA4 = s -> return s.indexOf("a") > 0;
		// Predicate<String> containsA5 = s -> { s.indexOf("a") > 0; };
	}
}