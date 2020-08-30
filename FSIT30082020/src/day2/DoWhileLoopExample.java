package day2;

/*
 * This program demonstrates the DO WHILE Loop using number pattern
 * 1
 * 12
 * 123
 * 1234
 * 12345 
*/

public class DoWhileLoopExample {

	public static void main(String[] args) {
		int row = 1;
		do{
			int col = 1;
			 do{
				System.out.print(col);
				col++;
			}while(col <= row);
			System.out.println();
			row++; // define incremental value otherwise do while will enter into infinite loop
		}while(row <= 5);//Runs the code block atleat ONCE even if the condition fails		

	}

}
