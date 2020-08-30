package day2;

/*
 * This program demonstrates the usage of Nested While Loop for displaying number pattern
 * 1
 * 12
 * 123
 * 1234
 * 12345
 */

public class NestedWhileLoopExample {

	public static void main(String[] args) {
		int row = 1;
		while(row <= 5) {
			int col = 1;
			while(col <= row) {
				System.out.print(col);
				col++;
			}
			System.out.println();
			row++; // define incremental value otherwise while will enter into infinite loop
		}
		
	}

}
