package com.indra.java.java8;

public class AppImpl extends App {
	
	static{
		System.out.println("Called from impl static block");
	}
	
	{
		System.out.println("Called from impl intailizer block");
	}
	
	AppImpl(){
		super();
		System.out.println("called from impl constructor");
	}

	public static void main(String[] args) {
		AppImpl obj = new AppImpl();
		obj.abstractMethod();
		obj.normalMethod();
		AppImpl.staticMethod();

	}

	@Override
	public void abstractMethod() {
		System.out.println("Calling from impl method");
		
	}

}

/*/
 * Output: 
 * 
Called from abstract static block
Called from impl static block
called from abstract intializer block
called from abstract constructor
Called from impl intailizer block
called from impl constructor
Calling from impl method
calling from normal method
calling from static method
 * 
 */


