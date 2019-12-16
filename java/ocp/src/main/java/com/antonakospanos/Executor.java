package com.antonakospanos;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Executor {
	
	/**
	 * Invokes all static methods of the passed class.
	 * 
	 * Disclaimer: It fails to invoke methods with args since it doesn't know what type of args to pass
	 * 
	 * @param className The class whose methods will be invoked
	 * @param numberOfArgs Should be zero
	 * @param methodsToExclude List of method names to be excluded
	 */
	public static void runStaticMethods(String className, Integer numberOfArgs, List<String> methodsToExclude) {
		Class<?> classz;
		List<String> blackList = methodsToExclude != null ? methodsToExclude : new ArrayList<>();
		try {
			classz = (Class<?>) Class.forName(className);
			
			Stream.of(classz.getMethods())
			.filter(m -> m.getParameterCount() == numberOfArgs)
			.filter(m -> !blackList.contains(m.getName()))
			.forEach(m -> {
					// Nested stream to list all method's parameter names
					System.out.println("The Method '" 
							+ m.getName() + "' requires the following " 
							+ m.getParameterCount() + " parameters: " + 
							Stream.of(m.getParameters())
								.map(Parameter::getName)
			          // :: is called 'Method Reference' operator
			          // creates a Function<Object, Object> that can be applied
								// and triggers the apply()
								// E.g:
			          // Function<Parameter, String> f = Parameter::getName;
								// String name = f.apply();
								//
			          // Instead we could use:
								//.map(p -> p.getName()) 
								.collect(Collectors.toList())
								.toString() + "\n"
							);
					try {
						m.invoke(classz.newInstance());
					} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | InstantiationException e) {
						e.printStackTrace();
					}
			});
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
	}
}