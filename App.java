package com.indra.java.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public abstract class App
{
	
	{
		System.out.println("called from abstract intializer block");
	}
	static{
		System.out.println("Called from abstract static block");
	}
	
	App(){
    	System.out.println("called from abstract constructor");
    }
	public abstract void abstractMethod();
	public void normalMethod(){
		System.out.println("calling from normal method");
	}
	public static void staticMethod(){
		System.out.println("calling from static method");
	}
}
