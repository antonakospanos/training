package com.antonakospanos.ocp.m04functional.stream;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class StreamManipulation {
	
	/**
	 * Prints the requested method's parameter of each passed class
	 * 
	 * @param args
	 */
	public static void printParameter (String methodName, int index, String... classNames) {
		
		for (String className : classNames) {
			Function<Parameter, String> f = Parameter::getName;
			try {
				Class<?> classZ = Class.forName(className);
				try {
					Method method =
					Stream.of(classZ.getMethods())
						.map(m -> {
							return printer.apply(m);
						})
						.filter(m -> m.getName().equals(methodName))
			      .collect(singletonCollector());
					
					System.out.println(f.apply(method.getParameters()[index]));
				} catch (SecurityException e1) {
					e1.printStackTrace();
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		}
	}
	
	/**
	 * Alternative stream() collection instead of:
	 * Stream.of(items)
	 * 	.findFirst()
	 * 	.get();
	 * 
	 * @return A collector that transforms the Collection to the Instance Type of the items
	 * 				 keeping only the first item of the Collection
	 */
	public static <T> Collector<T, List<T>, T> singletonCollector() {
		return Collector.of(ArrayList::new, List::add, (left, right) -> {
			left.addAll(right);
			return left;
		}, list -> {
			if (list.size() != 1) {
				throw new IllegalStateException();
			}
			return list.get(0);
		});
	}
	
	/**
	 * This variable defines the printing function of Method Objects
	 */
	public static Function<Method, Method> printer = new Function<Method, Method>() {
		@Override
		public Method apply(Method m) {
			System.out.println(m.getName());
			return m;
		}
	};
}
