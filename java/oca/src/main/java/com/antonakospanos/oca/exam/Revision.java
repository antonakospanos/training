package com.antonakospanos.oca.exam;

//import java.lang.*; java.lang package in imported BY DEFAULT!!! No need to re-declare it!

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

import com.antonakospanos.oca.exam.gocertify.Array1D;
import com.antonakospanos.oca.exam.gocertify.Array2D;
import com.antonakospanos.oca.exam.gocertify.InstanceOf;
import com.antonakospanos.oca.exam.gocertify.Octal;
import com.antonakospanos.oca.exam.java8certificationquestions.Arithmetic;
import com.antonakospanos.oca.exam.java8certificationquestions.DerivedClass;
import com.antonakospanos.oca.exam.java8certificationquestions.InstaceOfEvaluation;
import com.antonakospanos.oca.exam.java8certificationquestions.Switch;
import com.antonakospanos.oca.exam.java8certificationquestions.TimeManipulation;
import com.antonakospanos.oca.exam.myexamcloud.GarbageCollection;
import com.antonakospanos.oca.exam.oracle.Exceptions;
import com.antonakospanos.oca.exam.oracle.Love;
import com.antonakospanos.oca.exam.oracle.Programmer;
import com.antonakospanos.oca.exam.whizlabs.FunctionalInterfaceHelper;
import com.antonakospanos.oca.exam.whizlabs.LambdaWithoutArgs;
import com.antonakospanos.oca.exam.whizlabs.ListHelper;
import com.antonakospanos.oca.exam.whizlabs.LocalScope;

public class Revision {
	
	public static void main (String... args) {
		// Oracle official example
		Programmer.ex3();
		Exceptions.ex7();
		Love.find();
		
		// gortefy.com
		InstanceOf.evaluate();
		Octal.evaluate();
		new Array1D();
		new Array2D();
		// Variable identifiers (names) can explicitly start with a letter, a dollar mark or an underscore!
		
		//whizlabs
		LocalScope.evaluate("I am an arg to this static method");
		LambdaWithoutArgs.evaluate();
		Function<String, Integer> integerFunction = FunctionalInterfaceHelper.getIntegerFunction();
		
		testDefaultAccessModifier(); // without typing "default"!
		Integer[] tmpArray = {21, 13, 30, 11, 2};
		ListHelper.removeOdds(new ArrayList<>(Arrays.asList(tmpArray)));
		ListHelper.removeEvens(new ArrayList<>(Arrays.asList(tmpArray)));
		ListHelper.crateDummyList();
		
		// java8certificationquestions
		new DerivedClass(0);
		InstaceOfEvaluation.evaluateArray();
		Switch.evaluate(3);
		Switch.evaluate(0);
		Switch.evaluate(100);
		
		Arithmetic.playWithBinaries();
		Arithmetic.playWithOctals();
		Arithmetic.playWithdDecimals();
		Arithmetic.playWithHexs();
		
		TimeManipulation.diffInstants();
		TimeManipulation.diffDateTimes();
		
		// myexamcloud
		GarbageCollection.testGC();
		float prim = Float.parseFloat("1.2");
		Float obj = Float.valueOf("1.2");
	}
	
	/**
	 * Default methods are allowed only in interfaces!
	 */
	/*default*/ static void testDefaultAccessModifier() {}
}
