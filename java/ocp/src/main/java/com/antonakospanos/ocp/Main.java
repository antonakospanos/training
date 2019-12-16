package com.antonakospanos.ocp;

import com.antonakospanos.oca.m03datatypes.examples.AutoBoxing;
import com.antonakospanos.oca.m03datatypes.examples.ImmutableStringWrapper;
import com.antonakospanos.oca.m03datatypes.examples.MutableStringWrapper;
import com.antonakospanos.ocp.m11extras.reflection.Reflection;
import com.antonakospanos.ocp.m04functional.stream.StreamManipulation;

public class Main {
	
	public static void main (String... args) {
		reflection();
		streamManupulation();
	}
	
	public static void reflection() {
		System.out.println("------------------- Starting reflection() method.. -------------------");

		// com.antonakospanos.oca.m03datatypes.examples.MutableStringWrapper
		// com.antonakospanos.oca.m03datatypes.examples.ImmutableStringWrapper fails cause there is NOT a no-args constructor!
		// com.antonakospanos.oca.m03datatypes.examples.AutoBoxing
		Reflection.invokeMethodUsingReflection("toString", 
				MutableStringWrapper.class.getName(), 
				ImmutableStringWrapper.class.getName(), 
				AutoBoxing.class.getName());
	}
	
	public static void streamManupulation() {
		System.out.println("------------------- Starting streamManupulation() method... -------------------");

		StreamManipulation.printParameter("invokeMethodUsingReflection", 0, Reflection.class.getName());
	}
}
