package day2;

import java.util.Scanner;

/*
 * This program demonstrates Infinite For Loop
*/

public class InfiniteForLoopExample {

	public static void main(String[] args) {
		int counter = 1;
		String name;
		Scanner s = new Scanner(System.in);
		name = s.next();
		s.close();
		
		sample:
			for(;;) {
				if(counter>1000) 
					break sample;
				
				System.out.println("Welcome "+name+"!"+counter);
				counter++;
			}
	}

}
