package com.antonakospanos.oca.exam.gocertify;

public class Octal {

	public static void evaluate()	{
		int a[] = { 1, 2, 053, 4 };															// 053 is octal cause there is the '0' literal!!!!
		int b[][] = { { 1, 2, 4 }, { 2, 2, 1 }, { 0, 43, 2 } };
		
		System.out.print(a[3] == b[0][2]);					// 4=4
		System.out.print(" " + (a[2] == b[2][1]));  // 053(8)=43(10) cause 5*8^1+3*8^0 = 40+3 = 43 !!!
	}
}