package basics;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String bookTitle;
		String worldChoice = "ring";
		
		bookTitle = "the Lord of the rings";
	if	(bookTitle.contains(worldChoice)) {
		
		System.out.println ("This book title contains " + worldChoice);
	}
		
	
	String browser = "Chrome";
	if (browser.equalsIgnoreCase("chrome")) {
		System.out.println ("The browser is chrome");
	}
	
	String firstName = "Tim";
	String lastName = "Short";
	String ssn = "123456789";
	
	System.out.print (firstName.substring(0, 1));
	System.out.print (lastName.substring(0, 3));
	System.out.println (ssn.substring(5));
	
	System.out.println ("there are " + ssn.length() + " digits in ssn");
	}

}
