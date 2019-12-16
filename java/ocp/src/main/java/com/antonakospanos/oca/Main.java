package com.antonakospanos.oca;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.antonakospanos.Executor;
import com.antonakospanos.oca.exam.Revision;
import com.antonakospanos.oca.m02basics.Assert;
import com.antonakospanos.oca.m03datatypes.examples.AutoBoxing;
import com.antonakospanos.oca.m03datatypes.examples.ImmutableStringWrapper;
import com.antonakospanos.oca.m03datatypes.examples.MutableStringWrapper;
import com.antonakospanos.oca.m05arrays.examples.ArrayInitializer;
import com.antonakospanos.oca.m08inheritance.examples.BasePromise;
import com.antonakospanos.oca.m08inheritance.examples.impl.Specialization;
import com.antonakospanos.oca.m09exceptions.examples.CheckedExceptionHandling;
import com.antonakospanos.oca.m09exceptions.examples.MyCheckedException;
import com.antonakospanos.oca.m10apis.examples.CalendarManipulation;
import com.antonakospanos.oca.m10apis.examples.StringBuilderManipulation;
import com.antonakospanos.oca.m10apis.examples.StringManipulation;

/**
 * App created in the context of OCA training
 */
public class Main implements Serializable {
	
	private static final long serialVersionUID = 8426735796963772818L;
	public static final Logger LOGGER =  LoggerFactory.getLogger(Main.class);

	public static void main(String ... args) {
		System.out.println("Hello OCA!");
		
		basics(); 		 // Module 2  DONE
		dataTypes();   // Module 3  DONE
		
		operators(); 	 // Module 4  DONE
		arrays(); 		 // Module 5  DONE
		
		loops(); 			 // Module 6  DONE
		methods(); 		 // Module 7  DONE
		
		inheritance(); // Module 8  DONE
		exceptions();  // Module 9  DONE
		apis(); 			 // Module 10 DONE
		
		exam();				 // In Progress
		
		introductionToOCP();
	}
	
	private static void basics() {
		System.out.println("------------------- Starting Module 2: Basics -------------------");
		Assert.testAssert(0);
		
		System.out.println("------------------- Finishing Module 2: Basics -------------------\n");
	}
	
	private static void dataTypes() {
		System.out.println("------------------- Starting Module 3: Data Types -------------------");
		
		ImmutableStringWrapper.testImmutableStringWrapper();
		MutableStringWrapper.testMutableStringWrapper();
		AutoBoxing.testAutoBoxing();
		
		System.out.println("------------------- Finishing Module 3: Date Types -------------------\n");
	}
	
	private static void operators() {
		System.out.println("------------------- Starting Module 4: Operators -------------------");

		System.out.println("Reviewed all JAVA operators");

		System.out.println("------------------- Finishing Module 4: Operators -------------------\n");
	}
	
	private static void arrays() {
		System.out.println("------------------- Starting Module 5: Arrays -------------------");

		ArrayInitializer.initializeWithSystemCopy(new int[]{1,2,3}, new int[6]);

		ArrayInitializer.initializeWithTraditionalForLoop(new int[2][3]);
		ArrayInitializer.manipulateWithForEachLoop(new int[2][3]);
		ArrayInitializer.manipulateWithForEachLoop(new Integer[2][3]);

		System.out.println("------------------- Finishing Module 5: Arrays -------------------\n");
	}
	
	private static void loops() {
		System.out.println("------------------- Starting Module 6: Loops -------------------");

		System.out.println("------------------- Finishing Module 6: Loops -------------------\n");
	}
	
	private static void methods() {
		System.out.println("------------------- Starting Module 7: Methods -------------------");

		System.out.println("------------------- Finishing Module 7: Methods -------------------\n");
	}
	
	private static void inheritance() {
		System.out.println("------------------- Starting Module 8: Inheritance -------------------");

		Specialization s = new Specialization();
		if (s instanceof BasePromise) {
			System.out.println("Specialization is instance of the interface of the parent class!!");
		}
		
		System.out.println("------------------- Finishing Module 8: Inheritance -------------------\n");
	}
	
	private static void exceptions() {
		System.out.println("------------------- Starting Module 9: Exceptions -------------------");

		try {
			CheckedExceptionHandling.handleResources();
		} catch (MyCheckedException ce) {
			LOGGER.warn("CheckedExceptionHandling.handleResources failed cause: ", ce);
		}

		System.out.println("------------------- Finishing Module 9: Exceptions -------------------\n");
	}
	
	private static void apis() {
		System.out.println("------------------- Starting Module 10: APIs -------------------");
		
		stringBuilderManipulation();
		stringManipulation();
		calendarManipulation();
		
		System.out.println("------------------- Finishing Module 10: APIs -------------------\n");
	}
	
	
	
	/**
	 *  Revision and practice for the OCAJP8
	 */
	private static void exam () {
		System.out.println("------------------- Starting Revision & Exam Practice -------------------");
		
		Revision.main();

		System.out.println("------------------- Finishing Revision & Exam Practice -------------------\n");
	}
	
	/**
	 *  Main to OCPJP8
	 */
	private static void introductionToOCP() {
		System.out.println("------------------- Starting Main to OCPJP8 -------------------");

		Executor.runStaticMethods(com.antonakospanos.ocp.Main.class.getName(), 0, Arrays.asList("notifyAll", "wait", "notify"));
		
		System.out.println("------------------- Finishing Main to OCPJP8 -------------------\n");
	}
	
	
	
	/*
	 *  private methods for Module10: APIs
	 */
	private static void stringBuilderManipulation() {
		
		StringBuilder sb = StringBuilderManipulation.getHelloWorld();
		StringBuilderManipulation.deleteWord(sb, 5, sb.length());
		StringBuilderManipulation.insertStringRepresentation(sb, 5, new Object[] {"1", 2, 1.2});
		StringBuilderManipulation.replaceStringBuffer(sb, 5, sb.length(), " behaviour");
		StringBuilderManipulation.reverseStringBuffer(sb);
		StringBuilderManipulation.changeChar(sb, 0, '!');
		StringBuilderManipulation.truncateStringBuffer(sb, 9);
		
		String subString = StringBuilderManipulation.getSubString(sb, 1);
		char c = StringBuilderManipulation.getChar(sb, 0);
		StringBuilderManipulation.copyChars(sb, 0, 1, new char[] {c,}, 0);
		int firstExclamationIndex = StringBuilderManipulation.firstIndexOf(sb, "!");
		int lastExclamationIndex = StringBuilderManipulation.lastIndexOf(sb, "!");
		int capacity = StringBuilderManipulation.getCapacity(sb);
		StringBuilderManipulation.ensureCapacity(sb, capacity*2);
		StringBuilderManipulation.trimCapacity(sb);
	}
	
	private static void stringManipulation() {
		String s1 = "Hello, world!";
		String s2 = StringManipulation.getNewUpperCaseString(s1);
		// Compare the references to str1 and str2 objects
		if (s1 == s2) {
			LOGGER.info("str1 and str2 share the same memory address (reference)");
		} else {
			LOGGER.info("str1 and str2 do NOT share the same memory address (reference)");
		}
		// Compare the data of str1 and str2 objects
		if (s1.equals(s2)) {
			LOGGER.info("str1 and str2 contain the same data");
		} else {
			LOGGER.info("str1 and str2 do NOT contain the same data");
		}
		String s3 = StringManipulation.getString(new Object());
		String s4 = StringManipulation.getStringRepresentation(new Object());
		String s5 = StringManipulation.getConcatenatedString(s3, s4);
		String s6 = StringManipulation.getTrimmedString(s5);
		String s7 = StringManipulation.getReplacedString(s6, "old", "new");
	}
	
	private static void calendarManipulation() {
		
		LocalDateTime ldt1 = LocalDateTime.now();
		LocalDateTime ldt2 = CalendarManipulation.adjustDay(ldt1);
		
		long diffDays = CalendarManipulation.diffDays(ldt1, ldt2);
		long diffMillis = CalendarManipulation.diffMillis(ldt1, ldt2);
		
		// Change the ldt objects using java.time.Period
		Period day = Period.ofDays(1);
		Period month = Period.ofMonths(1);
		month = month.normalized(); // immutable class
		
		LocalDateTime ldt3 = CalendarManipulation.addPeriod(ldt1, day);
		LocalDateTime ldt4 = CalendarManipulation.addPeriod(ldt3, month);
	}
}