package com.antonakospanos.oca.exam.whizlabs;

import java.util.function.Function;

public class FunctionalInterfaceHelper {
	
	public static Function<String, Integer> getIntegerFunction() {
		Function<String, Integer> integerFunction = x -> Integer.valueOf(x);
		
		return integerFunction;
	}
}
