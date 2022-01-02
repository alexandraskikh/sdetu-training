package basics;

public class Task3 {

	public static void main(String[] args) {
	
		int [] array = {100, 2, 4,7,8};// TODO Auto-generated method stub
		System.out.println ("Min " + findMin(array));
		System.out.println ("Max " + findMax(array));
		System.out.println ("Avg " + findAvg(array));

	}
	
	public static int findMin (int [] passMin) {
		
		int min = passMin [0];
		for (int i=0; i<passMin.length; i++) {
			
			if (passMin [i] < min) {
				min = passMin [i];
			}
		}
		return min;
		
		
	}
	
public static int findMax (int [] passMax) {
		
		int max = passMax [0];
		for (int i=0; i<passMax.length; i++) {
			
			if (passMax [i] > max) {
				max = passMax [i];
			}
		}
		return max;
		
		
	}

public static int findAvg (int [] findAvg) {
	
	int sum = 0;
	for (int i=0; i<findAvg.length; i++) {
		
		sum = sum + findAvg [i];
	}
	return sum/findAvg.length;
	
	
}

}
