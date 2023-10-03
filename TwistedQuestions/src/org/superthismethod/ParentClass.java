package org.superthismethod;

public class ParentClass {		
	
	public ParentClass() {		
		System.out.println("I'm parent class constructor");
	}	
	
	public ParentClass(String s) {
		this();		
		System.out.println(s);
	}
	public ParentClass(int age) {
		this();		
		System.out.println(age);
	}	
	public void parentMethod() {
		System.out.println("I'm parent class method");
	}
	
	public static void main(String args[]) {
		ParentClass p = new ParentClass();	
		p.parentMethod();
		new ParentClass("NARMATHA");
		new ParentClass(25);
		
	}
	


}
