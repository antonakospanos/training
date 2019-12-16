package com.antonakospanos.oca.exam.oracle;

public class Programmer extends Writer {
	
	public static void write() {
		System.out.println("Writing code...");
	}
	
	public static void ex3() {
		System.out.println("------------------- Starting Programmer.ex3() method.. -------------------");

		System.out.println("new Programmer instantiating a Writer object:");
		Writer w = new Programmer();
		w.write();	// The compiler warns us that write() is a static method and we should not use an instantiated object to invoke it!
		System.out.println("@Override applies ONLY on instance varibles (methods), not on static variable (methods)!");
		
		System.out.println("\nWriter.write()");
		Writer.write();

		System.out.println("\nProgrammer.write()");
		Programmer.write();
	}
}
