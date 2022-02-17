package arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {
		
		List<String> sandwiches = new ArrayList<>();
		
		sandwiches.add("Bread Sandwich");
		sandwiches.add("Poptart");
		sandwiches.add("Hot Dog");	
		System.out.println(sandwiches);
		
		
		Collections.sort(sandwiches);
		System.out.println(sandwiches);
		
		Collections.reverse(sandwiches);
		System.out.println(sandwiches);
		
		Collections.swap(sandwiches, 1, 2);
		System.out.println(sandwiches);

		
		System.out.println("===========================");
		
		System.out.println("normal loop");
		for(int i = 0; i < sandwiches.size(); i++)
		{
			System.out.println(sandwiches.get(i));
		}
		
		System.out.println("enhanced loop");
		for(String i : sandwiches)
		{
			System.out.println(i);
		}
		
		System.out.println("===========================");
		
		System.out.println(sandwiches.get(2));
		
		System.out.println("===========================");
		
		sandwiches.set(2, "Borgar!?");

		System.out.println("enhanced loop");
		for(String i : sandwiches)
		{
			System.out.println(i);
		}
		System.out.println("===========================");
		
		sandwiches.remove(1);
		
		System.out.println("enhanced loop");
		for(String i : sandwiches)
		{
			System.out.println(i);
		}
		System.out.println("===========================");
		
		
			
	}
	
	public void Sandwiches()
	{
		List<String> sandwiches = new ArrayList<>();
		
		sandwiches.add("Bread Sandwich");
		sandwiches.add("Poptart");
		sandwiches.add("Hot Dog");
		
		System.out.println(sandwiches);
	}
	
	
}