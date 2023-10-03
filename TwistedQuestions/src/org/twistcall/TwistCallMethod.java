package org.twistcall;

public class TwistCallMethod {		
	
	public TwistCallMethod() {		
		System.out.println("I'm parent class constructor");
	}	
	
	public TwistCallMethod(String s) {
		this();		
		System.out.println(s);
	}
	public TwistCallMethod(int age) {
		this();		
		System.out.println(age);
	}	
	public void parentMethod() {
		System.out.println("I'm parent class method");
	}
	
	
	
	public static void main(String args[]) {
		new TwistCallMethod();
		new TwistCallMethod("Narmatha");
		new TwistCallMethod(25);
		
	}
	


}
