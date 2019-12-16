package com.antonakospanos.oca.exam.java8certificationquestions;

/**
 * x may be either:
 * <ol>
 * <li>byte</li>
 * <li>char</li>
 * <li>short</li>
 * <li>int</li>
 * 
 * <li>enum (J5)</li>
 * <li>String (J7)</li>
 * <ol>
 * 
 * @author antonakospanos
 */
public class Switch {
	
	private static final int THREE = 3;
	private static final char ALPHA = 'A';
	
	public static void evaluate(int x) {
		final int i; // NOT adapted as constant!
		i = 1000;
		int k = 100; // NOT adapted as constant!

		final int j = 10; // adapted as constant!
		
		switch (x) {
			default: System.out.println("default");// evaluated explicitly in case no "case" matches. Without break; however the execution will continue to case 0 and 1! 
			case 0: System.out.println("0");
			case 1: System.out.println("1"); break;
			
			case 2: System.out.println("2"); break;
			case THREE: System.out.println(THREE); break;
//		case i: INVALID! case expressions must be constant expressions!
//		case k: INVALID! case expressions must be constant expressions!
			case j: System.out.println(j); break; // break is optional here (it's the last case)
		}
	}
	
	public static void evaluate(char x) {
		final char i; // NOT adapted as constant!
		i = 'C';
		char k = 'K'; // NOT adapted as constant!
		final char j = 'B'; // adapted as constant!
		
		switch (x) {
			default: System.out.println("default");// evaluated explicitly in case no "case" matches. Without break; however the execution will continue to case 0 and 1! 
			case 'a': System.out.println("a");
			case 'b': System.out.println("b"); break;
			
			case 'c': System.out.println("c"); break;
			case ALPHA: System.out.println(ALPHA); break;
//		case i: INVALID! case expressions must be constant expressions!
//		case k: INVALID! case expressions must be constant expressions!
			case j: System.out.println(j); break; // break is optional here (it's the last case)
		}
	}
}