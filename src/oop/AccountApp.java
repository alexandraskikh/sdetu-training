package oop;

public class AccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LoanAccount la = new LoanAccount ();
  la.increaseRate();
  la.setRate();
  
  
  la.setAmortSchedule();
  la.setTerm(20);
	
	
	IRate account1 = new LoanAccount ();
  account1.increaseRate();
  account1.setRate();
  
}
}