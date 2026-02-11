/**
 * 
 */

/**
 * 
 */

import java.util.Scanner; // allows us to read keyvoard input

public class BodyMassIndexActivity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create constants and variables
		final double BMI_US_FACTOR = 703;
		double bmi ;
		double weight;
		double height;
		
		
		// constants
		 // factor formula in pounds
		// Variables
		// The user's weight
		// The user's height
		 // The user's BMI
		// Create a Scanner object for scanning input from the keyboard.
		Scanner keyboard = new Scanner(System.in);
		// Tell the user what the program will do.
		System.out.println("This program will calculate your " + "body mass index, or BMI.");

		// Get the user's weight.
		System.out.print("Enter your weight, in pounds: ");
		// ADD CODE to input next double for weight
		weight = keyboard.nextDouble();
		// Get the user's height.
		System.out.print("Enter your height, in inches: ");
		// ADD CODE input next double for height
		height = keyboard.nextDouble();
		// Calculate the user's body mass index.
		bmi = weight * BMI_US_FACTOR / (height * height);

		// Display the user's BMI.
		System.out.printf("Your body mass index (BMI) is %f", bmi);
		if (bmi <= 18.5) {
		System.out.println(" Underweight");
		}
		else if (bmi <= 25) {
		System.out.println(" Normal");
		}
		else if (bmi <= 30) {
		System.out.println(" Overweight");
		}
		else {
		System.out.println(" Obese");
		}
		
		
		
	}

}
