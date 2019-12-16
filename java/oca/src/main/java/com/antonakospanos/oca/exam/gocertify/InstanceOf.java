package com.antonakospanos.oca.exam.gocertify;

import com.antonakospanos.oca.exam.oracle.Writer;

public class InstanceOf {
	
	public static void evaluate() {
		System.out.println((new Writer() {} instanceof Object));	// returns true!
	}
}
