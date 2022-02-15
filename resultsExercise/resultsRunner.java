package resultsExercise;

public class resultsRunner {

	public static void main(String[] args) {
		System.out.println(results.marksOverall());
		System.out.println("===========================");
		System.out.println(results.markPercentage());
		
		if(results.percentage < 60)
		{
			System.out.println("Fail");
		}
		else if(results.physics < 60 || results.chemistry < 60 || results.biology < 60)
		{
			System.out.println("Failed one or more subjects");
		}
	}
}