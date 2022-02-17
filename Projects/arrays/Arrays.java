package arrays;


import java.util.Scanner;

public class Arrays
{

	public void arrayExercise()
	{
		int[] array = {10,20,30,40,50,60,70,80,90,100};
		
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
		
		System.out.println("==========================");
		
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i] * 10);
		}
	}


	public void arrayExerciseUserInput()
	{
		int[] arr = new int [10];
		
		for(int i = 0; i < 10; i++)
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter number: ");
			arr[i] = scan.nextInt();
		}	
		
		System.out.println();
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("==========================");
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i] * 10);
		}
	}
}
