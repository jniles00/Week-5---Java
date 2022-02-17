package forEachLoops;

import java.util.Scanner;

public class runner {

	public static void main(String[] args) 
	{
		Exercises exercises = new Exercises();
	
		// Exercise 1
		System.out.println("Exercise 1:");
		exercises.Exercises1();
		
		System.out.println("=======================");
		
		// Exercise 2
		System.out.println("Exercise 2:");
		exercises.Exercise2();
		
		System.out.println("=======================");
		
		//Exercise 3
		System.out.println("Exercise 3:");
		System.out.println(exercises.Exercise3(70));
		
		System.out.println("=======================");
		
		//Exercise 4
		System.out.println("Exercise 4:");
		exercises.Exercise4();
		
		System.out.println("End of program");
		}
}
