package com.antonakospanos.oca.exam.whizlabs;

public abstract class MyAbstractFunctionalImplementation implements MyFunctionalInterface, MyFunctionalInterface2 {

	@Override
	public String getName() {
		return MyFunctionalInterface.super.getName();
	}
}
