package day2;

import java.util.Scanner;

/*
 * This program demonstrates the For Loop with following example
 * Purpose of looping is to repeat certain actions certain specified number of times
 * Accept your name and welcome you 10 times
 * Syntax - for(initial value; no. of iterations; increment/decrement)
*/

public class ForLoopExample1 {

	public static void main(String[] args) {
		String name;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name:");
		name = s.next();
		
		for(int i=0;i<=10;i++) {
			System.out.println("Welcome " + name + "! " + i);
		}
		
		System.out.println("*******************************" );
		System.out.println("*******************************" );
		
		for(int i=10;i>=0;i--) {
			System.out.println("Welcome " + name + "! " + i);
		}		
		s.close();
	}

}
