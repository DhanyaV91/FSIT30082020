package day2;

/*
 * This program demonstrates the pattern using Nested For Loop
 * 1				123456
 * 12				 12345
 * 123                1234
 * 1234
 * 12345
 * 123456 
*/

public class ForLoopExample2 {

	public static void main(String[] args) {
		for(int row=1;row<=6;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(col);
			}
			System.out.println();
		}
		System.out.println("**********************");
		System.out.println("**********************");
		int counter = 1;
		for(int row=6;row>=1;row--) {
			for(int col=row;col>=1;col--) {
				System.out.print(col);
			}
			System.out.println();
			for(int i=1;i<=counter;i++) {
				System.out.print(" ");
			}
		}
	}

}