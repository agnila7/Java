package com.oops_level2.inheritance;

public class EmployeeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee = new Employee("Agnila", "Software Dev" );
//		employee.setName("chapal");
		employee.setEmail("chapal@gmail.com");
//		employee.setTitle("Software Developer");
		employee.setEmployer("RBC");
		employee.setSalary(40000);
		
		System.out.println(employee);
	}

}
