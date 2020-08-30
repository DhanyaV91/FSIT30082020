package day2;

import java.util.Scanner;

/*
 * This program demonstrates Switch Block
 * Syntax:
 * switch(variable){
 * 	case1:
 * 	case2:
 * 	default:
 * }
 * Accept weekday from user as (1,2,3....7)
 * Monday = 1
 * Tuesday = 2
 * ...
 * Sunday = 7
 * If user enters any other number then display invalid weekday
 */

public class SwitchBlockExample {

	public static void main(String[] args) {
		int weekday;
		int count = 0;
		Scanner s = new Scanner(System.in);
		
		while(count == 0) {
			System.out.println("Enter the weekday:");
			weekday = s.nextInt();
			
			switch(weekday) {
				case 1: System.out.println("It's Monday!");
					break;
				case 2 : System.out.println("It's Tuesday!");
					break;
				case 3 : System.out.println("It's Wednesday!");
					break;
				case 4 : System.out.println("It's Thursday!");
					break;
				case 5 : System.out.println("It's Friday!");
					break;
				case 6 : System.out.println("It's Saturday!");
					break;
				case 7 : System.out.println("It's Sunday!");
					break;
				default : System.out.println("Invalid Weekday!");		
			}
			System.out.println("If you want to continue press 0 or press 1 to exit:");
			count = s.nextInt();			
		}
		s.close();
	}

}
