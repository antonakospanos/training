package com.antonakospanos.oca.exam.oracle;

public class Exceptions {

	public static void ex7() {
		System.out.println("------------------- Starting Exceptions.ex7() method.. -------------------");

		int x = 10;
		int y = 2;
		try {
			for (int z =2; z>=0; z--) {
				int ans = x/z;
				System.out.println(ans + " ");
			}
		} catch (Exception ex) {
			System.out.println("E1");
//		} catch (ArithmeticException ea) { // Unreachable catch block for ArithmeticException. 
//			System.out.println("E2");				 // It is already handled by the catch block for Exception
		}
	}
}
