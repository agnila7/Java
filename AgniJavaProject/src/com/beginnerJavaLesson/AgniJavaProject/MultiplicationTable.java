package com.beginnerJavaLesson.AgniJavaProject;

public class MultiplicationTable {
	
//	void printTable() {
//		for(int i=1; i <= 10; i++ ) {
//			System.out.printf("%d * %d = %d", 5,i,5*i).println();
//		}
//	}
	
	void printTable(){
		printTable(5);
		//printTable(5,1,10);
	}
	
	//now we do method overloading: two methods with same name but diff parameters.
//	void printTable(int numb) {
//		for(int i =0; i <= 10; i++) {
//			System.out.printf("%d * %d = %d", numb,i,numb*i).println();
//		}
//	}
	
	//shortcut of code to ignore the duplication of code
	void printTable(int numb) {
		printTable(numb,1,10);
	}

	//printing from any range for any number
	void printTable(int numb, int from, int to) {
		for(int i =from; i <= to; i++) {
			System.out.printf("%d * %d = %d", numb,i,numb*i).println();
		}
	}
	
}
