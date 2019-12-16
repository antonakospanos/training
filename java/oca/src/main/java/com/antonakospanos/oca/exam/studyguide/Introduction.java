package com.antonakospanos.oca.exam.studyguide;

public class Introduction {
	
	private void printTitle() {
		System.out.println("OCA");
	}
	
	protected void printTitle(String s) {
		System.out.println(s);
	}

	public static void main(String ...strings) {
		Introduction intro = new NestedIntroduction(); // NestedIntroduction is visible in the source file! 
	}
}

class NestedIntroduction extends Introduction {
	
	public static void callMe(String ...strings) {
		Introduction intro = new NestedIntroduction2(); // NestedIntroduction is visible in the source file! 
	}
	
	// This does NOT @Overrides the super PRIVATE one!
	public void printTitle(){
		System.out.println("Java Programmer I");
	}
	
	@Override // This @Overrides the super PROTECTED one!
	public void printTitle(String s){
		System.out.println("OCA " + s);
	}
}

class NestedIntroduction2 extends Introduction {
	
	public static void callMe(String ...strings) {
		Introduction intro = new NestedIntroduction(); // NestedIntroduction is visible in the source file! 
	}
	
	// This does NOT @Overrides the super PRIVATE one!
	public void printTitle(){
		System.out.println("Java Programmer II");
	}
	
	@Override // This @Overrides the super PROTECTED one!
	public void printTitle(String s){
		System.out.println("OCAJP " + s);
	}
}