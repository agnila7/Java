package com.oops_level2.interfaceExample;

public class MainProject {

	public static void main(String[] args) {
		ComplexAlgorithm algorithm = new DummyAlgorithm();
		System.out.println(algorithm.complexAlgorithm(5, 3));
		
		//interface creates communication between two systems[ComplexAlgorithm and Project]. both systems are accepting that there is an interface. 
		//the outsource team or dummyAlgorithm will have the real implementation of this.
		// the actual interface can have thousands of codes and you can just which your implementationa nd use more than one outsource to use in a class.

		// it provides communication between two different project.
	}
}

