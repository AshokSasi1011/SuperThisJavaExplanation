package org.superthismethod;

public class ChildClass extends ParentClass{
	
	public ChildClass() {
		super();
		System.out.println("I'm child class constructor");
	}	
		
	public ChildClass(String name) {
		this();	
		System.out.println(name);
	}
	public ChildClass(int age) {
		super();		
		System.out.println(age);
	}	
	
	public void childMethod() {
		System.out.println("I'm child class method");
	}	
	
	public static void main(String args[]) {
		ChildClass c = new ChildClass();			
		c.childMethod();
		new ChildClass("PARITHI");
		new ChildClass(2);
		
	}
	
	

}
