package basics;

public class Cities {

	public static void main(String[] args) {
		//Declare and define an array
		
		String [] cities = {"New York", "San Francisco", "Miami", "Dallas"};
		
		System.out.println(cities [0]);
		System.out.println(cities [1]);
		System.out.println(cities [2]);
		System.out.println(cities [3]);
		
		System.out.println("*****************");

		//Declare the array
		
		String [] states = new String [5];
		
		states [0] = "California";
		states [1] = "Ohio";
		states [2] = "New Jersey";
		states [3] = "Texas";
		states [4] = "Utah";

		
		int i = 0;
		// do loop enters the loop then tests condition
		do {
			System.out.println (states [i]);
		i=i+1;
		
		} while (i<5);
		
		//while tests condition first then enters loop
		System.out.println("*****************");
		int n=0;
		boolean stateFound = true;
		
		while (!stateFound) {
			String state = states [n];
			System.out.println (state);
			if (state == "Texas") {
				System.out.println ("state finally found");
				stateFound=false;
				}
			n++;
		}
		
		System.out.println("\nPrinting with for loop");
		
    for (int x =0; x <5; x++) {
    	
    	System.out.println (states [x]);
    }
		
    
    String firstName ="Tim";
    System.out.println (firstName.substring(0, 3));
		
		/*
		int n=0;
		boolean stateFound = false;
        начало while:
		если значение выражения: "not stateFound" ложное перейти в "конец if1"
		String state = states [n];
		System.out.println (state);
		если значение выражения: "state == "Texas"" ложное перейти в "конец if2"
		System.out.println ("state finally found");
		stateFound=true;
		конец if2:
		n++;
		перейти в "начало while"
		конец if1:*/

		
	}
}
		/*Declare array
		String [] countries;
		
		
		 Define array
		countries = new String [3];
		countries [0] = "uk";
		countries [1] = "usa";
		countries [2] = "canada";
		System.out.println (countries [1]);
	} */



