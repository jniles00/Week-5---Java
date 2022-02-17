package flowchartExercise;

public class Flowcharts {

	public static void main(String[] args) {
		
		System.out.println(flowchartMethod(5, 10, true));
		System.out.println(flowchartMethod(5, 10, false));
	}
	
	public static int flowchartMethod(int numOne, int numTwo, boolean isTrue)
	{
		int result;
		
		if(isTrue)
		{
			result = numOne + numTwo;
		}
		else
		{
			result = numOne * numTwo;
		}
		
		return result;
	}

}
