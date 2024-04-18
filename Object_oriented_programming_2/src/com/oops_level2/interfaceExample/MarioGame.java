package com.oops_level2.interfaceExample;

public class MarioGame implements GamingConsole{// it is the main implementation of the interface

	@Override
	public void up() {
		System.out.println("Jump");
		
	}

	@Override
	public void down() {
		System.out.println("Goes into a hole");
		
	}

	@Override
	public void left() {
		
		
	}

	@Override
	public void right() {
		System.out.println("Go forward");
		
	}
	
	
}
