package com.oops_level2.inheritance;

public class Employee extends Person{

	//state
	private String title;
	private String employer;
	private int employerGrade;
	private int salary;
	
	//creation
	public Employee(String name, String title) {
		//asap employee constructor is called, a super method call happen implicitly. hence the superclass Person constructor gets called automatically
		super(name);
		this.title = title;
		System.out.println("Employee Constructor");
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEmployer() {
		return employer;
	}
	public void setEmployer(String employer) {
		this.employer = employer;
	}
	public int getEmployerGrade() {
		return employerGrade;
	}
	public void setEmployerGrade(int employerGrade) {
		this.employerGrade = employerGrade;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String toString() {
//		return  super.getName()+ "##" +  super.getEmail() + "##" + employer + "##" + salary;
		return  super.toString()+ "##" + title +"##" + employer + "##" + salary;
		
	}
}
