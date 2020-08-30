package day2;

import java.util.Scanner;

/*
 * This program demonstrates the Nested If exmaple
 * Accept age and weight to check if the person can donate blood
*/

public class NestedIfExample {

	public static void main(String[] args) {
		int age;
		int weight;
		int count = 0;
		Scanner s = new Scanner(System.in);
		
		
		while(count == 0) {
			System.out.println("Enter your age:");
			age = s.nextInt();
			
			if(age >= 18) {
				System.out.println("Enter your weight:");
				weight = s.nextInt();
				if(weight >= 50) { // Nested If - If inside another if
					System.out.println("By age and weight you are eligible to donate blood!");
				}else {
					System.out.println("You are under weight hence you are not eligible to donate blood!");
				}
				
			}else {
				System.out.println("You are under age hence you are not eligible to donate blood!");
			}
			System.out.println("If you want to continue press 0 or press 1 to exit:");
			count = s.nextInt();
		}
		s.close();
	}
	
}
