package blackJack;

public class BlackJack {

	public static void main(String[] args) {
	
		System.out.println(play(10, 21));
		System.out.println(play(20, 18));
		System.out.println(play(1, 22));
		System.out.println(play(22, 23));
		
	}

	public static int play(int numOne, int numTwo)
	{
		if(numOne > 21 && numTwo > 21)
		{
			return 0;
		}
		else if(numOne < numTwo && numTwo <= 21)
		{
			return numTwo;
		}
		else if(numOne < numTwo && numTwo >= 21)
		{
			return numOne;
		}
		else if(numOne > numTwo && numOne <= 21)
		{
			return numOne;
		}
		return 0;
	}
}
