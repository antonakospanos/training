package com.antonakospanos.oca.exam.java8certificationquestions;

public class Loop {
	
	public static void executeTraditionalForLoop() {
		int[] in = {1,2,3};
		int tmp = 0;
		for (int x = 0; ++x < 4; tmp = in[x++]) {
			System.out.println(in[x]);
		}
	}
	
	public static void executeTraditionalForLoop(String in[]) {
		// int[] in = {1,2,3}; Compilation ERROR: in already assigned from the argList!
		
		for (int x = 0; ++x < 4; x++) {
			System.out.println(in[x]);
		}
	}
}