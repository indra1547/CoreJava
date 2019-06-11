package com.indra.CoreJava.EqaulsContract;

import java.util.HashSet;
import java.util.Set;

public class ClientTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		emp1.setId(10);
		emp2.setId(10);
		System.out.println(emp1.equals(emp2)); // true
		Set<Employee> emps = new HashSet<Employee>();
		emps.add(emp1);
		emps.add(emp2);
		System.out.println(emps); // as both emp1 and emp2 objects are equal, hash set holds only one object
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
	}

}
