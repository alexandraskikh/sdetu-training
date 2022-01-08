package labs;

import java.util.Arrays;

public class StudentConstructorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 StudentConstructor st1 = new StudentConstructor ("Joey","1234121234",13414);
 StudentConstructor st2 = new StudentConstructor ("Frank Sinatra","1324546789",1434.2);
 StudentConstructor st3 = new StudentConstructor ("New Name","1324546789",1243);
 
 
    st1.setCity("San Francisco");
	System.out.println ("The city is " + st1.getCity());
	st1.setPhone("4152541410");
	System.out.println ("The phone is " + st1.getPhone());
	st1.setState("CA");
	System.out.println ("The state is " + st1.getState());
	
	st1.enroll();
	st2.enroll();
	st3.enroll();
	st1.showCourse();
	
	st1.checkBalance();
	st1.pay(200);
	st1.pay(200);
	st1.pay(200);
	System.out.println (st1.toString());
	}
	
	

}



class StudentConstructor implements Courses {
	//Properties of bank account
	
	private static int ID = 0; // private static ID
	private String emailId; //name + @gmail.com
	private String userId; // ID +  random 4 digits between 1000 and 9000 + last 4 of SSN
	private String name;
	private String SSN;
	
	private String phone;
	private String city;
	private String state;
	private String cake;
	private double balance;

	
	// New Student constructor that takes name and SSN in the arguments
	
	public StudentConstructor (String name, String SSN, double initBalance) {
	balance = initBalance;	
	this.SSN=SSN;
    this.name=name;
	System.out.println ("New Student Record is created");	
	
	ID++;

	setUserId ();
	setEmailId ();
	
   
	
	}
	
	
	private void setUserId () {
		int max = 90;
		int min = 10;
		double a=Math.random();
		System.out.println (a);
		int random =  (int) (a * (max-min));
		random = random + min;
		System.out.println ("Your userId: " + random);
	
	}
	
	//Automatically create an email ID based on the name
	private void setEmailId () {
		String emailSuffix = "@gmail.com";
		emailId = name.replaceAll("\\s+", "").toLowerCase() + emailSuffix;
		System.out.println ("Your emailId: " + emailId);
	
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}
	
	
	public void enroll () {
		
		System.out.println (name + " is now enrolled to study.");
	}
	
	
	

	public void pay(double amount) {
		balance = balance - amount;
		System.out.println ("Paid Bill:" + amount);
		checkBalance ();
	} 
	
	
	public void checkBalance() {
		System.out.println ("Current balance is: " + balance);
	}


	@Override
	public void  showCourse () {
     System.out.println("Available courses are: " + Arrays.toString(CourseList));
	
		
	} 
	
	@Override
	public String toString ()
	{
	return " [Name: " + name + " ]\n [Phone: " + phone + " ]\n [City: " + city + " ]\n [Balance: " + balance + " ]";
	
	} 
	
}

