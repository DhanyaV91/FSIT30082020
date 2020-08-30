package day2;

import java.util.Scanner;

/*
 * This program demonstrates multiple cases in Switch Block
 * If the day entered by user is "Mon", "Wed" and "Fri" then display you can buy the tickets
 * If the day entered by user is "Tue", "Thu", "Sat" and "Sun"  then display you can't buy the tickets
 * Otherwise display invalid day
*/

public class SwitchBlockExample1 {

	public static void main(String[] args) {
		String day;
		int count = 0;
		Scanner s = new Scanner(System.in);
		
		while(count == 0) {
			System.out.println("Enter the weekday:");
			day = s.next();		
			switch(day) {
				case "Mon" : 
				case "Wed" : 
				case "Fri" : System.out.println("You can buy the tickets on " + day+"!");
							break;
				case "Tue":
				case "Thu":
				case "Sat":
				case "Sun": System.out.println("You can't buy the tickets on " + day+"!");
							break;
				default : System.out.println("Invalid WeekDay Entered!!!");
			}
			System.out.println("If you want to continue press 0 or press 1 to exit!");
			count = s.nextInt();
		}
		s.close();
	}

}
