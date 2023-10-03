package org.superthiskeyword;

public class ChildClass extends ParentClass{
	
	public static String name = "PREETHI";
	public static int age = 27;
	
	public ChildClass() {
		super();
		System.out.println("I'm child class constructor");
	}	
		
	public ChildClass(String name) {
		this();	
		System.out.println(name);
		System.out.println(super.name);
		
	}
	public ChildClass(int age) {
		super();		
		System.out.println(age);
		System.out.println(this.name);
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
