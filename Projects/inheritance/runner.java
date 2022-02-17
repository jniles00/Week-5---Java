package inheritance;

public class runner {

	public static void main(String[] args) {

		Dog dog1 = new Dog();
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		
		dog1.noise();
		cat1.noise();
		cat1.setColour("black");
		System.out.println(cat1.getColour());
		System.out.println(cat2.getColour());	
	}
}