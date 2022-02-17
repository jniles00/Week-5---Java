package uniqueSum;

public class UniqueSum {

	public static void main(String[] args) {

		System.out.println(Input(1,2,3));
		System.out.println(Input(3,3,3));
		System.out.println(Input(1,1,2));

	}

	
	public static int Input(int numOne, int numTwo, int numThree)
	{
		int sum = 0;
		
		if(numOne == numTwo && numTwo == numThree)
		{
			return 0;
		}
		else if(numOne == numTwo)
		{
			return numThree;
		}
		else if(numOne == numThree)
		{
			return numTwo;
		}
		else if(numThree == numTwo)
		{
			return numOne;
		}
		else
		{
			return sum = numOne+numTwo+numThree;
		}
		
		/*
		if(numOne == numTwo || numTwo == numThree)
		{
			return 0;
		}
		else if(numOne == numTwo)
		{
			return numThree;
		}
		else if(numThree == numTwo)
		{
			return numOne;
		}
		else
		{
			return sum = numOne+numTwo+numThree;
		}
		*/
	}
}
