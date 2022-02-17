package encapsulation;

//Create a class with 4 attributes, 3 constructors (including a default constructor),
//as well as getters and setters for each attribute and a toString method
//DONT GENERATE THE GETTERS AND SETTERS (this is for your own practice so avoid generating the getters and setter)

public class ImportantInfo
{
	private int passportNo;
	private String firstName;
	private String lastName;
	private String memorableWord;

	// Default constructor
	public ImportantInfo()
	{
		
	}
	
	// All argument constructor
	public ImportantInfo(int passportNo, String firstName, String lastName, String memorableWord)
	{
		this.passportNo = passportNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.memorableWord = memorableWord;
	}
	
	// get is always a return method with no parameter
	public int getPassportNo()
	{
		return passportNo;
	}
	
	// set is always void with a parameter
	public void setPassportNo(int newPassportNo)
	{
		this.passportNo = newPassportNo;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setFirstName(String newFirstName)
	{
		this.firstName = newFirstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setLastName(String newLastName)
	{
		this.lastName = newLastName;
	}
	
	public String getMemorableWord()
	{
		return memorableWord;
	}
	
	public void setMemorableWord(String newMemorableWord)
	{
		this.memorableWord = newMemorableWord;
	}

}



