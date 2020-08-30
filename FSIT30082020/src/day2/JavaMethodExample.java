package day2;

import java.util.Scanner;

public class JavaMethodExample {
	
	public static void drawLine() {
		System.out.println("**********************************");
	}
	int addition(int a, int b) {
		return a+b;
	}
	static int subtraction(int a, int b) {
		return a-b;
	}
	float product(float a, float b) {
		return a*b;
	}
	static void division(float a, float b) {
		System.out.println("Division : " + a/b);
	}
	
	int modulus(int a , int b) {
		return a%b;
	}

	public static void main(String[] args) {
		int num1;
		int num2;
		float num3;
		float num4;
		
		Scanner s  = new Scanner(System.in);
		System.out.println("Enter num1 value:");
		num1 = s.nextInt();
		System.out.println("Enter num2 value:");
		num2 = s.nextInt();
		System.out.println("Enter num3 value:");
		num3 = s.nextFloat();
		System.out.println("Enter num4 value:");
		num4 = s.nextFloat();
		s.close();
		
		JavaMethodExample j = new JavaMethodExample();
		
		drawLine();
		System.out.println("Addition result: " + j.addition(num1, num2));
		drawLine();
		System.out.println("Subtraction result: " + subtraction(num1, num2));
		drawLine();
		System.out.println("Product result: " + j.product(num3, num4));
		drawLine();
		division(num3, num4);
		drawLine();
		System.out.println("Modulus result: " + j.modulus(num1, num2));		
		drawLine();
	}

}
