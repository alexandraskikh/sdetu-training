package basics;

public class Weather {
	
	
	public static void main (String [] args) {
		
		int temperature = 41;
		
		String sunCondition = "Overcast";
		
		if (temperature > 80 ) {
			
			System.out.println("It is pleasant. Wear shorts and t-shirt");
			
			
		}
		
		else if ( (temperature>60) && (sunCondition == "Sunny")) {
			
			System.out.println ("It looks like a cold day.");
			
			System.out.println ("Wear a hat.");
		}
		
		else if ( (temperature>50) || (sunCondition == "Overcast")) {
			
			System.out.println ("Overcast.");
		}
		
		else {
			System.out.println ("Dont go out lol");
		}
		
		System.out.println ("Program is ending");
	}

}
