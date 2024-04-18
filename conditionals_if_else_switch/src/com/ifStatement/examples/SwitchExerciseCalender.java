package com.ifStatement.examples;

import java.util.Scanner;

public class SwitchExerciseCalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number for your day: 1(Sunday) to 6 (Monday) :");
		int dayNumber = scanner.nextInt();
		System.out.println(isWeekDay(dayNumber));
		
		System.out.println("Enter the Number for your day: 1(Sunday) to 6 (Monday) :");
		int dayName = scanner.nextInt();
		System.out.println(detemineNameOfDay(dayName));
		
		System.out.println("Enter the Number for your month: 1(January) to 8(AUGUST) :");
		int monthNumber = scanner.nextInt();
		determineNameOfMonth(monthNumber);

	}
	
		
	public static boolean isWeekDay(int dayNumber) {
		// TODO Auto-generated method stub
		switch(dayNumber) {
//		case 1: return false;
//		case 2: return true;
//		case 3: return true;
//		case 4: return true;		
//		case 5: return true;
//		case 6: return false;
		
//		case 1: 
//		case 6: return false;
		case 2: 
		case 3: 
		case 4: 		
		case 5: return true;
		
		}
		return false;
	}


	public static String detemineNameOfDay(int dayName) {
		// TODO Auto-generated method stub		
//		String result = "";
//		switch(dayNumber) {
//		case 1: 
//			result ="Sunday";
//			break;
//		case 2: 
//			result ="Monday";
//			break;	
//		case 3: 
//			result ="tues";
//			break;
//		case 4: 
//			result ="wed";
//			break;		
//		case 5: 
//			result ="fri";
//			break;
//		case 6: 
//			result ="Saturday";
//			break;	
//		case 0: 
//			result ="thurs";
//			break;
//		default:
//			result ="INVALID";
//		}
//		return result;
		
		switch(dayName) {
		case 1: return "Sunday";
		case 2: return "Monday";
		case 3: return "tuesday";
		case 4: return "wednesday";		
		case 5: return "thursday";
		case 6: return "friday";
		}
		return "INVALID";
	}


	public static void determineNameOfMonth(int monthNumber) {
		// TODO Auto-generated method stub
		switch(monthNumber) {
		case 1: 
			System.out.println("JAN");
			break;
		case 2: 
			System.out.println("FEB");
			break;	
		case 3: 
			System.out.println("MARCH");
			break;
		case 4: 
			System.out.println("APRIL");
			break;		
		case 5: 
			System.out.println("MAY");
			break;
		case 6: 
			System.out.println("JUNE");
			break;	
		case 7: 
			System.out.println("JULY");
			break;
		case 8: 
			System.out.println("AUGUST");
			break;
		default:
			System.out.println("INVALID");
		}
		
		
	}

}
