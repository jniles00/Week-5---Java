package inheritance;

//Task: One parent class, 2 children class (you can decide what you want to do,
//		if you are stuck go with animal as parent class and 2 types of animals as children classes)
//		2 or 3 attributes per class, 2 constructors (one being the default), and getters and setters


public class Animals {

	private String eat;
	private String noise;
	private int noOfLegs;
	private boolean canFly;
	
	public Animals() {}
	
	
	public Animals(String eat, String noise, int noOfLegs, boolean canFly)
	{
		this.eat = eat;
		this.noise = noise;
		this.noOfLegs = noOfLegs;
		this.canFly = canFly;
	}
	
	public String getEat()
	{
		return eat;
	}
	
	public void setEat(String newEat)
	{
		this.eat = newEat;
	}
	
	public String getNoise()
	{
		return noise;
	}
	
	public void setNoise(String newNoise)
	{
		this.noise = newNoise;
	}
	
	public int getNoOgLegs()
	{
		return noOfLegs;
	}
	
	public void setNoOgLegs(int newNoOfLegs)
	{
		this.noOfLegs = newNoOfLegs;
	}
	
	public boolean getCanFly()
	{
		return canFly;
	}
	
	public void setCanFly(boolean newCanFly)
	{
		this.canFly = newCanFly;
	}
	
	public void noise()
	{
		System.out.println("Animal Noise!");
	}
	
}