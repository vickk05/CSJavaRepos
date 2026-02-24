
import java.util.Scanner; 

public class M02L06MathCharsStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Allows to read input
		Scanner input = new Scanner(System.in);
		
		// A string stores multiple characters; that is non-primitive, storing it by double quotes.
		//A char only stores one single character; that is primitive.
		// Create string variable
		String firstName;
		String lastName;
		String noun;
		String verb;
		String adjective;
		String place;
		
		// Now we prompt the user
		System.out.print("Enter a first name: ");
		firstName = input.next();
		
		System.out.print("Enter a last name: ");
		lastName = input.next();
		
		System.out.print("Enter a noun: ");
		noun = input.next();
		
		System.out.print("Enter a verb ending in -ing:");
		verb = input.next();
		
		System.out.print("Enter a adjective: ");
		adjective = input.next();
		
		System.out.print("Enter a place: ");
		place = input.next();
			
		
		// Read a character
		System.out.print("Enter your favorite letter: ");
		char favLetter = input.next().charAt(0);
		
		// Extract first character
		char firstCharacter = lastName.charAt(0);
		
		// In order to read a string, we use the next() from the scanner class.
		// The next() reads one word from the keyboard.
		
		// To read a char we use input.next().charAt(0).
		// The next() reads a word, and the charAt takes the first letter.
		// The position 0 is the first letter because in Java it begins on 0.
		
		// Now we build the Mad Lib Story
        String  madlibStory = "Once upon a time," + firstName + " " + firstCharacter + " was " +
		verb + " through the " + place + " with a " + noun + ". It was a very " + adjective + 
		" day. Their favorite letter was " + favLetter + ".";
		// Now we print
		System.out.println(madlibStory);
				
        // "Concatenate" means to combine strings.
		// We use the + operator to combine them.
		
		
		
		
	}
	

}
