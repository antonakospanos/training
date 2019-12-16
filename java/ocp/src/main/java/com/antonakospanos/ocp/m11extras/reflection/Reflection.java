package com.antonakospanos.ocp.m11extras.reflection;

public class Reflection {
	
	/**
	 * For each passed className instantiates the class 
	 * using its parameterless constructor 
	 * and invokes the passed parameterless method
	 *  
	 * @param methodName Parameterless method
	 * @param classNames Classes with parameterless constructors
	 */
	public static void invokeMethodUsingReflection(String methodName, String... classNames) {
		int passed = 0;
		int failed = 0;
		// The reflective instantiation and invocation
		//  no longer require explicit array creation, because 
		// the 'getMethod' and 'invoke' class methods 
		// accept a variable argument list (varargs)
		for (String className : classNames) {
			try {
				Class c = Class.forName(className);
				c.getMethod(methodName).invoke(c.newInstance()); // Invoke instance method using reflection!
				System.out.printf("Method invocation of '%s' in '%s' succeeded!%n", methodName, className);
				passed++;
			} catch (Exception ex) {
				System.out.printf("Method invocation of '%s' in '%s' failed cause: %s%n", methodName, className, ex);
				failed++;
			}
		}
		System.out.printf("passed=%d; failed=%d%n%n", passed, failed);
	}
}