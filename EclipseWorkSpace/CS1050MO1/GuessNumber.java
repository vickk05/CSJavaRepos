/**
 * This program takes user input to see if they can guess the 
 * random number generated. Add comments to explain the code.
 */

import java.util.Scanner;

public class GuessNumber
{
	public static void main(String[] args)
	{		//This is a constant that does not change while the program runs.
		    // In this case it makes 100, the max number.
		final int RANDOM_MULTIPLIER = 100;
		
		
        // This is a variable
		// Int means it has to be a whole number, no double.
		
		int number = (int) (Math.random() * RANDOM_MULTIPLIER) + 1;
        
		//Scanner in this case is used to read the input
		Scanner keyboardInput = new Scanner(System.in);
		
		// Gives the user the instructions
		System.out.println("Guess a magic number between 0 and 100");

		// Another variable
		int guess = -1;
		// This is a loop that repeats until the number is correct.
		
		while (guess != number)
		{
            // Here it asks for the guess.
			System.out.print("\nEnter your guess: ");
			guess = keyboardInput.nextInt();
            // Here it checks to see if it's the correct guess.
			if (guess == number) 
			{ // This is if the guess is correct.
				System.out.println("Yes, the number is " + number);
			}// If your guess is too high.
			else if (guess > number)
			{
				System.out.println("Your guess is too high");
			} // Here is the last program that will end this loop if its too low
			  // it will say too low and run it again.
			else
			{
				System.out.println("Your guess is too low");
			}
		}

	}//end of main
}//end of class
