package com.automation.world;

import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Two Numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();

		
		System.out.println("Enter an Operator");
		char operator = sc.next().charAt(0);

		switch (operator) {
		case '+':
			System.out.println("Addition of two numbers:"+(a + b));
			break;
		case '-':
			System.out.println("Subtraction of two numbers:"+(a - b));
			break;
		case '*':
			System.out.println("Multiplication of two numbers:"+(a * b));
			break;
		case '/':
			System.out.println("Division of two numbers:"+(a / b));
			break;
		default:
			System.out.println("ERROR: Unsupported Operation");
		}

	}

}
