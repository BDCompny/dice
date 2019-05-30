package javacourse;
import java.util.*;


public class Javacourse {

	public static void main(String[] args) { //class
		
		
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter a dice Number [1-6]: ");
		int userInput = ss.nextInt();
		
			
		
			
		
		if(userInput > 6 ) {
			System.err.println("Please enter a number between [1-6]");
		}
		else {
			Random sc = new Random(); // tools
			int dice = sc.nextInt(6)+1;
			System.out.println("Rolled: " + dice);
			
			// Accuracy in percent
			
			int difference = Math.abs(userInput - dice) ;
			System.out.println("The difference is: "+difference);  //int x = Math.abs(-5);
			
			if(difference == 0) {
				
				System.out.println("You are 100% correct!");
			
				
			}
			else {
				int accuracy = (6 - difference);
				
				
				float percent = accuracy * 16.6666667f;
				
				
				System.out.printf("The difference in percetage: %.2f ", percent  );
				System.out.print("%");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
				
				

	}

}
