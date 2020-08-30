package day2;

import java.util.Scanner;

/*
 * This program illustrates the double dimensional array
 * arrayA = {{20,30,40}, {12,45,34}, {43,23,12}}
 * arrayB = get values from user
 * arrayC = arrayA + arrayB
 * Display all the array values
*/

public class DoubleDimensionalArrayExample {
	
	public static void display(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print("["+arr[i][j]+"] ");
			}
			System.out.println();
		}
	}
	public static int[][] read(){
		int a[][] = new int[3][3];
		Scanner s  = new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		s.close();
		return a;
	}
	public static int[][] add(int[][] a1,int[][] a2){
		int[][] sum=new int[3][3];
		
		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a1.length;j++)
			{
			sum[i][j]=a1[i][j]+a2[i][j];	
			}
		}
		return sum;		
	}

	public static void main(String[] args) {
		int arrayA[][] = {{20,30,40}, {12,45,34}, {43,23,12}};
		int arrayB[][] = new int[3][3];
		int arrayC[][] = new int[3][3];

		JavaMethodExample.drawLine();
		display(arrayA);
			
		arrayB=read();
		JavaMethodExample.drawLine();
		display(arrayB);
		JavaMethodExample.drawLine();
		arrayC=add(arrayA,arrayB);
		display(arrayC);
		JavaMethodExample.drawLine();		
	}

}
