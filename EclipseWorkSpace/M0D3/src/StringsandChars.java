import java.util.Scanner;

public class StringsandChars
{

	public static void main(String[] args)
	{
		// We import the scanner and then add it into our class to allow input.
		Scanner KeyboardInput = new Scanner(System.in);

		// Here we prompt the user to enter a set of words.
		// We read the string by using next(), it will only read a word.
		System.out.println("Enter a first name: ");
		String firstName = KeyboardInput.next();

		System.out.println("Enter a last name: ");
		String lastName = KeyboardInput.next();

		System.out.println("Enter a noun: ");
		String noun = KeyboardInput.next();

		System.out.println("Enter a verb ending in -ing");
		String verbing = KeyboardInput.next();

		System.out.println("Enter an adjective: ");
		String adjective = KeyboardInput.next();

		System.out.println("Enter a place: ");
		String place = KeyboardInput.next();

		/*
		 * In this part we prompt the user again, except we use char to save a singular
		 * letter. next().charAt(0) will read the word and take the first character and
		 * store it as a char. All depending where the index is at.
		 */
		System.out.println("Enter your favorite letter: ");
		char favWord = KeyboardInput.next().charAt(0);

		/*
		 * We use char to save a singular character from a word we chose. We use the
		 * index 0 since in a string the first letter is not 1, but starts at 0
		 */
		char firstInitial = lastName.charAt(0);

		/*
		 * When we declare a string the computer will remember long inputs of letters ,
		 * numbers and symbols while the char data type only saves a singular character.
		 */

		// We use the variables to create the Mad Lib from the data that was inputed and
		// stored.
		// We use concatenate to add together text and variables by using + symbol.
		String madLib = ("\nOnce upon a time, " + firstName + " " + firstInitial + " was " + verbing + " through the "
				+ place + " with a " + noun + ". It was a very " + adjective + " day. Their favorite letter was "
				+ favWord + ".");
		System.out.println(madLib);

	}

}
