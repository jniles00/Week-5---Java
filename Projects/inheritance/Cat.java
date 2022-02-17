package inheritance;

public class Cat extends Animals{

	private String breed;
	private String colour;
	
	public Cat() {}
	
	public Cat(String breed, String colour)
	{
		this.breed = breed;
		this.colour = colour;
		this.setCanFly(false);
	}
	
	public String getBreed() {
		return breed;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public String getColour() {
		return colour;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	@Override
	public void noise()
	{
		System.out.println("Nyaaa~");
	}

	@Override
	public String toString() {
		return "Cat [breed=" + breed + ", colour=" + colour + ", getBreed()=" + getBreed() + ", getColour()="
				+ getColour() + "]";
	}
	
	
}
