package basics;

public class FactorialApp {

	public static void main(String[] args) {
		/*
		0!  = 1
		1! = 1
		2! = 2*1 = 2
		3! = 6
		 */
		System.out.println(fac(6));
		
	}
		public static int fac(int n) {
			
			if (n==0) {
				return 1;
			}
			else if (n == 1) {
				return 1;
			}
		
		
		return n*(fac(n-1));
}
}
