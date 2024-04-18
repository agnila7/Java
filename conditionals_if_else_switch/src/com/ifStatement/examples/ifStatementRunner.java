package com.ifStatement.examples;

public class ifStatementRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		puzzle5();
	}

		private static void puzzle1(){
			int i =25;
			if(i==25)
				System.out.println("i = 25");
			else if(i==24)
				System.out.println("i = 24");
			else
				System.out.println("i is neither 25 or 25");
		}

	
		public static void puzzle2(){
			int i =25;		
			if(i>=25)
				System.out.println("i = 25");
			else if(i<24)
				System.out.println("i = 24");
			else if(i>24)
				System.out.println("i = 24");
			else
				System.out.println("i is neither 25 or 25");
		}
		
		private static void puzzle3(){
			int i =25;
			if(i==25)
				System.out.println("i = 25");
			else if(i==24)
				System.out.println("i = 24");
			else
				System.out.println("i is neither 25 or 25");
		}
		
		private static void puzzle4(){
			int i =25;
			if(i<20) {
				if(i>24)
				System.out.println("i = 24");
				else
				System.out.println("i is neither 25 or 25");
			}
		}
		
		private static void puzzle5(){
			int i = 5;
			if(i<6) {
				i += 10;
				i++;
				System.out.println(i);
			}
		}
	}
