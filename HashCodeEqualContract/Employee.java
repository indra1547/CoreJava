package com.indra.CoreJava.EqaulsContract;

public class Employee {
	private Integer id;
	private String firstName;
	private String lastName;
	private String department;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	// overiding equals method to compare content
	public boolean equals(Object o) {
		if(o == null) {
			return false;
		}
		if(o == this) {
			return true;
		}
		if(getClass() != o.getClass()) {
			return false;
		}
		Employee e = (Employee)o;
		return (this.getId() == e.getId());
	}
	public String toString() {
		return "Result : " + this.getId();
	}
	// overiding hash code method as per overriding equals and hashcode contract
	public int hashCode() {
		final int PRIME = 33;
		int result = 1;
		return (result * PRIME) + getId();
	}
}
