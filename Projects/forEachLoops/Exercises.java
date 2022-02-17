package forEachLoops;

import java.util.Scanner;

public class Exercises {
	
	String[] stringArray = {"hello", "world"};
	int[] intArr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	
	public void Exercises1()
	{
		//Exercise1();	
		for(String str: stringArray)
		{
			System.out.println(str);
		}
	}

	public void Exercise2()
	{
		//Exercise 2	
		for(int i : intArr)
		{
			System.out.println(i);
		}
	}

	public static boolean Exercise3(int a)
	{		
		if(a % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void Exercise4()
	{
		int[] intArr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		for(int i : intArr)
		{
			Exercise3(i);
			if(Exercise3(i) == true)
			{
				System.out.println(i * i * i);	
			}
			else
			{
				System.out.println(i * i);
			}
		}
	}
	
	public static boolean Exercise3_UserInput(int a)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		a = scan.nextInt();
		
		if(a % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
