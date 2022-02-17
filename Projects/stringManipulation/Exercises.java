package stringManipulation;

public class Exercises {
	
	String str1 = "yesterday it was raining";
	String str2 = "today it is sunny, ";
	int stringLength = str1.length();

	
	public void Exercise1()
	{
		System.out.println(str2.toUpperCase() + str1.toUpperCase());	
	}
	
	public void Exercise2()
	{
		System.out.println(str2.toUpperCase().substring(0,11) + str1.toUpperCase().substring(16,24));	
	}
	
	public void Method1()
	{
		System.out.println("String length is: " + stringLength);
	}
	
	public void Method2()
	{
		System.out.println(str1.replace(" ", "\n"));
	}
	
	public void Method3()
	{
		System.out.println(str1.replace(" ", "\n"));
		System.out.println(str1.substring(0, 24));
	}
	
	public boolean Method4(String str3)
	{
		System.out.println(str3.contains(str1));
		
		if(str3.contains(str1))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
