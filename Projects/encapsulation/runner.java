package encapsulation;

public class runner {

	public static void main(String[] args) {

		ImportantInfo importantInfo = new ImportantInfo();
		
		importantInfo.setFirstName("Jimothy");
		importantInfo.setLastName("Johnold");
		importantInfo.setPassportNo(1234567890);
		importantInfo.setMemorableWord("Pollacks");
		
		System.out.println(importantInfo.getFirstName());
	}

}
