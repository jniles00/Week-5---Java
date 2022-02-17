package inheritance;

public class Dog extends Animals {

	private String breed;
	private boolean isGoodDog;
	
	public Dog() {}
	
	public Dog(String breed, boolean isGoodDog)
	{
		this.breed = breed;
		this.isGoodDog = isGoodDog;
		this.setCanFly(false);
	}
	
	public String getBreed() {
		return breed;
	}
	
	public void setBreed(String newBreed) {
		this.breed = newBreed;
	}

	public boolean IsGoodDog()
	{
		return isGoodDog;
	}
	
	private void setIsGoodDog(boolean newIsGoodDog) {
		this.isGoodDog = newIsGoodDog;
	}
}
