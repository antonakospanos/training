package com.antonakospanos.oca.exam.whizlabs;

@FunctionalInterface
public interface MyFunctionalInterface2 {
	
	static final String NAME = "MyFunctionalInterface";
	
	static void print() {
		System.out.println("I am a functional interface!");
	}
	
	default String getName() {
		return NAME;
	}
	
	abstract String toString();	// to be implemented from Object class
	abstract boolean equals(Object o); // to be implemented from Object class
	abstract int hashCode(); // to be implemented from Object class
	
//	abstract Object clone(); Cannot be defined in a @FunctionalInterface cause their access modifier is less than public!
//	abstract void finalize(); Cannot be defined in a @FunctionalInterface cause their access modifier is less than public!

	/**
	 * This is the single abstract method (SAM) of the interface -called "functional method"- 
	 * that shall be implemented by the implementation class in case of using 
	 * Lambda Expressions, hence adapting this interface as a {@link FunctionalInterface}!  
	 * 
	 * @param s
	 */
	abstract void execute(String s);
}
