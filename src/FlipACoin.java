import java.util.Scanner;

public class FlipACoin {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Guess which will have more: Heads or Tails?");
		
		String guess = "nothing";
			
		while (guess != "Heads" || guess != "Tails") {
			guess = scnr.next();
			if((guess.matches("Heads") || (guess.matches("heads")))) { 
				System.out.println("You have chosen Heads");
						break; 
					}
			else if (guess.matches("Tails") || (guess.matches("tails"))) { 
				System.out.println("You have chosen Tails");
						break;
					}
			else {
				System.out.println("Your input is not Heads or Tails. Please try again.");
				
		 	}
		}
		
		System.out.println("How many times shall we flip a coin");

		float numOfFlipsOrig = scnr.nextInt();
		float numOfFlips = numOfFlipsOrig;
		int correctCountHeads = 0;
		int correctCountTails = 0;
		float correctCount = 0;
		while (numOfFlips > 0 ) {
			if (Math.random() < 0.5){
				System.out.println("Heads");
				correctCountHeads = correctCountHeads + 1;
				
				}
			else {
				System.out.println("Tails");
				correctCountTails = correctCountTails + 1;
				
		 	}
			if (numOfFlips > 0) {
				numOfFlips--;
				}
		}
		if ((guess.matches("Heads") || (guess.matches("heads")))) {
			correctCount = correctCountHeads;
			
		}
		else {
			correctCount = correctCountTails;
			
		}
		
			System.out.println("Your guess, " + guess + ", came up " + correctCount + " times!");
			
		float percentage = correctCount / numOfFlipsOrig;
		percentage = percentage * 100;
		
		System.out.println("That's " + percentage + "%");
		
		
			
}
	}

		



