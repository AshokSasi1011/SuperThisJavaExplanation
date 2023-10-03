package org.superthiskeyword;

public class ParentClass {	
	
	public static String s = "SASIKUMAR";
	public static int age = 32;
	
	public ParentClass() {		
		System.out.println("I'm parent class constructor");
	}	
	public ParentClass(String s) {
		this();			
		System.out.println(s);
		System.out.println(this.s);
	}
	public ParentClass(int age) {
		this();		
		System.out.println(age);
		System.out.println(this.age);
	}	
	public void parentMethod() {
		System.out.println("I'm parent class method");
		System.out.println(this.s);
		System.out.println(this.age);
	}
	
	public static void main(String args[]) {
		ParentClass p = new ParentClass();	
		p.parentMethod();
		new ParentClass("NARMATHA");
		new ParentClass(25);
		
	}
	


}
