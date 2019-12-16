package com.antonakospanos.oca.exam.gocertify;

public class Array2D {

	private int[][] a;

	public Array2D() {
		this.a = new int[3][]; // the compiler accepts the instantiation even if there is not array size in the 2nd dimension!!

		a[1] = new int[] { 1, 2, 3 };	// initialization of the second nested array
		a[2] = new int[] { 4, 5 };		// initialization of the third nested array

		System.out.print(a[1][1]);		// 2!
	}
}
