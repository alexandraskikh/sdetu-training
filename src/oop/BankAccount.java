package oop;

public class BankAccount implements IRate {

//Define variables

	//static variable
		
		private static final String routingNumber="012456";
		
		
		//instance variables
		private String name;
		String accountNumber;
		private String ssn;
	    String accountType;
	    double balance =0;
		
		//Constructor
		
		BankAccount () {
			System.out.println ("NEW ACCOUNT CREATED");
		}
		
		//Overloading
		BankAccount (String accountType) {
			System.out.println ("NEW ACCOUNT " + accountType);
		}
		
		BankAccount (String accountType, double initDeposit) {
			//accountType, initDeposit, Msg are local variables
			System.out.println ("NEW ACCOUNT " + accountType);
			String Msg = null;
			System.out.println ("INITIAL DEPOSIT OF: $ " + initDeposit);
			if (initDeposit<1000) {
				Msg = "Error: minimum deposit should be at least $1000";
				System.out.println (Msg);
				
			} else
			{
			Msg = "Thanks for your inital deposit of " + initDeposit;
				
			}
			System.out.println (Msg);
			balance = balance + initDeposit;
			
		}
		
		//getters and setters
		
		public void setName (String name)
		
		{
this.name = "Mr " + name;
		}
		
		
		
		
		public String getName ()
		
		{
     return name;
		}
	
		
		public String getSsn() {
			return ssn;
		}

		public void setSsn(String ssn) {
			this.ssn = ssn;
		}
		
		
		//Interface methods
		public void setRate () {
			System.out.println("SETTING RATE"); 
		}
		
		public void increaseRate () {
			System.out.println("INCREASING RATE"); 
		}
		
		
		//Define methods

		public void deposit (double amount) 	{
			
			 balance = balance + amount;
             showActivity ("DEPOSIT");
		}
		
	    void withdraw (double amount) 	{
	    	balance = balance + amount;
	    	showActivity ("WITHDRAW");
		}
	    
	 private  void showActivity (String activity) 	{
		  System.out.println ("YOUR RECENT TRANSACTION " + activity);
		  System.out.println ("YOUR NEW BALANCE IS " + balance);
	  		}
	  	    
	    
       void checkBalance () 	{
    	   
    		System.out.println ("Balance " + balance);
			
		}
       
       void getStatus () 	{
			
		}
	
       @Override
	public String toString () {
		return " [ NAME:" + name + ". ACCOUNT#" + accountNumber + ". ROUTING#" + routingNumber + " .BALANCE: $ " + balance + " ]";
	}
	}


