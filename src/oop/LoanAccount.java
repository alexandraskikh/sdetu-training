package oop;

public class LoanAccount implements IRate {

	@Override
	public void setRate() {
		
		System.out.println ("Rate");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void increaseRate() {
		
		System.out.println ("Increase Rate");
		// TODO Auto-generated method stub
		
	}
	
public void setTerm (int term) {
		
		System.out.println ("Setting the term to " + term + " years.");
	}
	
public void setAmortSchedule () {
		
		System.out.println ("Amortization schedule.");
	}


}
