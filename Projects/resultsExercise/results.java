package resultsExercise;

public class results {
	
	public static int physics = 120;
	public static int biology = 98;
	public static int chemistry = 58;
	public static int total;
	public static float percentage;
	
	public static int marksOverall()
	{
		System.out.println("Your physics score is: " + physics);
		System.out.println("Your biology score is: " + biology);
		System.out.println("Your chemistry score is: " + chemistry);
		total = physics + biology + chemistry;
		System.out.println("Your total score is: " + total + "/450");
		return total;
	}
	
	public static float markPercentage()
	{
		System.out.println("Your physics score is: " + physics);
		System.out.println("Your biology score is: " + biology);
		System.out.println("Your chemistry score is: " + chemistry);
		total = physics + biology + chemistry;
		percentage = (total * 100)/ 450;
		System.out.println("Your percentage is: " + percentage + "%");
		return percentage;
	}

}
