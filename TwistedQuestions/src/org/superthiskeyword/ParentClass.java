package org.superthiskeyword;

public class ParentClass {	
	
	public static String name = "SASIKUMAR";
	public static int age = 32;
	
	public ParentClass() {		
		System.out.println("I'm parent class constructor");
	}	
	public ParentClass(String name) {
		this();			
		System.out.println(name);
		System.out.println(this.name);
	}
	public ParentClass(int age) {
		this();		
		System.out.println(age);
		System.out.println(this.age);
	}	
	public void parentMethod() {
		System.out.println("I'm parent class method");
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	public static void main(String args[]) {
		ParentClass p = new ParentClass();	
		p.parentMethod();
		new ParentClass("NARMATHA");
		new ParentClass(25);
		
	}
	


}
