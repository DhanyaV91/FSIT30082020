package day2;

import java.util.Scanner;

/*
 * Display the following string pattern using the Nested For Loop 
 * L
 * LO
 * LOT
 * LOTU
 * LOTUS
 * LOTU
 * LOT
 * LO
 * L
*/

public class ForLoopExample3 {

	public static void main(String[] args) {
		String name;
		Scanner s  = new Scanner(System.in);
		name = s.nextLine();
		s.close();
		int row;
		for(row=0;row<name.length();row++) {
			for(int col=0;col<=row;col++) {
				System.out.print(name.charAt(col));
			}
			System.out.println();
		}
		for(int i=row-1;i>=1;i--) {
			for(int col=0; col<i;col++) {
				System.out.print(name.charAt(col));
			}
			System.out.println();
		}

	}

}
