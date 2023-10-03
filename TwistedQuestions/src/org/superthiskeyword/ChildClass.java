package org.superthiskeyword;

public class ChildClass extends ParentClass{
	
	public static String s = "PREETHI";
	public static int age = 27;
	
	public ChildClass() {
		super();
		System.out.println("I'm child class constructor");
	}	
		
	public ChildClass(String s) {
		this();	
		System.out.println(s);
		System.out.println(super.s);
		
	}
	public ChildClass(int age) {
		super();		
		System.out.println(age);
		System.out.println(this.s);
	}	
	
	public void childMethod() {
		System.out.println("I'm child class method");
		System.out.println(this.age);
		System.out.println(super.age);
	}
	
	
	public static void main(String args[]) {
		ChildClass c = new ChildClass();			
		c.childMethod();
		new ChildClass("PARITHI");
		new ChildClass(2);
		
	}
	
	

}
