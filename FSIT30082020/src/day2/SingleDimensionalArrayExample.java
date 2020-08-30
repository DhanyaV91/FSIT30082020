package day2;

import java.util.Scanner;

/*
 * This program demonstrates the Single Dimensional Array
 * Read array myArr[5] from user and display the values
 * initialize myArr = {12, 23, 45, 23}
*/

public class SingleDimensionalArrayExample {
	
	static void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Value of index "+i+":"+arr[i]);
		}		
	}

	public static void main(String[] args) {
		int myArr[] = new int [5];
		int myArr1[] = {12, 23, 45, 23};
		Scanner s = new Scanner(System.in);
		for(int i=0;i<myArr.length;i++) {
			System.out.println("Enter the value of index "+i+":");
			myArr[i] = s.nextInt();
		}
		JavaMethodExample.drawLine();
		display(myArr);
		JavaMethodExample.drawLine();
		display(myArr1);		
		
		s.close();

	}

}
