package stringManipulation;

public class runner {

	public static void main(String[] args) {

		String str3 = "I have to go to the shop later today, I know that yesterday it was raining. So I hope today it doesn't rain"; 
		
		Exercises exercise = new Exercises();
		
		System.out.println("Exercise 1");
		exercise.Exercise1();
		System.out.println("=====================");

		System.out.println("Exercise 2");
		exercise.Exercise2();
		System.out.println("=====================");
		
		System.out.println("Method 1");
		exercise.Method1();
		System.out.println("=====================");
		
		System.out.println("Method 2");
		exercise.Method2();
		System.out.println("=====================");
		
		System.out.println("Method 3");
		exercise.Method3();
		System.out.println("=====================");

		System.out.println("Method 4");
		exercise.Method4(str3);
		System.out.println("=====================");
	}
}
