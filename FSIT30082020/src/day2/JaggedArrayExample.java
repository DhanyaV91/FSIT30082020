package day2;

import java.util.Scanner;

/*
 * This program demonstrates Jagged Array
 * 20 30 
 * 23 56 45 87
 * 97 12 45 
*/

public class JaggedArrayExample {
	static void display(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("["+arr[i][j]+"] ");
			}
			System.out.println();
		}
	}
	static int[][] read(){
		int a[][] = new int[3][];
		a[0] = new int[2];
		a[1] = new int[4];
		a[2] = new int[3];
		
		Scanner s  = new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		s.close();
		return a;
	}
	public static void main(String[] args) {
		int arr[][] = new int[3][];
		arr[0] = new int[2];
		arr[1] = new int[4];
		arr[0] = new int[3];
		
		JavaMethodExample.drawLine();
		arr = read();
		JavaMethodExample.drawLine();
		display(arr);

	}

}
