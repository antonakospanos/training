package com.antonakospanos.oca.exam.whizlabs;

public class LocalScope {
	
	public static void evaluate(String a) {
		int x;
		{
			int y; // this a local scope var
		}
		// a, x are visible here, y is not!!!
	}
}
