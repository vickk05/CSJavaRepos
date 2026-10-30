import java.util.Scanner;

/**
 * Ask user for a base and save the data. Ask user for an exponent and save the
 * data. validates the exponent to be sure its positive. Calculates the base and
 * exponent. Prints the answer.
 */

public class L10Lab
{

	public static void main(String[] args)
	{
		Scanner Input = new Scanner(System.in);

		System.out.println("Enter a base:");
		double baseVal = Input.nextDouble();

		System.out.println("Enter a positive integer exponent:");
		int exVal = Input.nextInt();

		int resultEx = getEx(exVal, Input);

		double result = calcPow(baseVal, resultEx);
		System.out.println(baseVal + " raised to exponent " + resultEx + " is " + result + ".");

	}

	/**
	 * Will pass down data from main method. Checks if the input is positive, and
	 * will read validEx. Add Input to get another number. If its not, it will keep
	 * asking until the exponent is valid. Will return valid exponent.
	 */

	public static int getEx(int validEx, Scanner Input)
	{

		while (validEx <= 0)
		{
			System.out.println("Invalid input. Enter a positive integer:");
			validEx = Input.nextInt();
		}

		return validEx;

	}

	/**
	 * Will calculate the base and power. We pass down the baseVal to get the base
	 * that was inputed. We pass validEx for the positive exponent. Returns the
	 * answer after the loop.
	 */

	public static double calcPow(double baseVal, int validEx)
	{
		double result = 1;
		int counter = 0;

		while (counter < validEx)
		{
			result = result * baseVal;
			counter++;
		}
		return result;
	}

}
