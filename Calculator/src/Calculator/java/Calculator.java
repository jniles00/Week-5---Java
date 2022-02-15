package Calculator.java;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println(Addition());
		System.out.println(Subtraction());
		System.out.println(Multiply());
		System.out.println(Division());
	}

	public static int Addition() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number one: ");
		int numOne = scan.nextInt();
		System.out.println("Enter number two: ");
		int numTwo = scan.nextInt();

		int result = numOne + numTwo;

		return result;
	}

	public static int Subtraction() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number one: ");
		int numOne = scan.nextInt();
		System.out.println("Enter number two: ");
		int numTwo = scan.nextInt();

		int result = numOne - numTwo;

		return result;
	}

	public static int Multiply() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number one: ");
		int numOne = scan.nextInt();
		System.out.println("Enter number two: ");
		int numTwo = scan.nextInt();

		int result = numOne * numTwo;

		return result;
	}

	public static double Division() { 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number one: ");
		double numOne = scan.nextDouble();
		System.out.println("Enter number two: ");
		double numTwo = scan.nextDouble();
		
		if(numOne < numTwo || numTwo == 0)
		{
			System.out.println("This division can not be performed");
		}
		else
		{
			double result = numOne / numTwo;
		}
		
		return 0;
	}
}
