import java.util.Scanner;

public class LabL15ArraysIntro
{

	public static void main(String[] args)
	{
		Scanner Input = new Scanner(System.in);

		// Ask user for student count, and validate it.
		System.out.print("Hello user, enter how many students are in the classroom:");
		int studentCount = Input.nextInt();
		int validStudent = validateStudents(Input, studentCount);

		// Here we create the Arrays.
		double[] finalGrades = new double[validStudent];
		String[] firstNames = new String[validStudent];

		// Enter student names, and final grades into arrays.
		enterInfo(Input, finalGrades, firstNames);

		// Gets the class average, and display the class average.
		double printAvg = getAverage(finalGrades);

		// Display all students.
		displayAllStudents(finalGrades, firstNames);

		// Displays students name and grade that are above average.
		getAboveAvg(finalGrades, firstNames, printAvg);

	}

	/*
	 * Validates user input, and returns a positive whole number for the size of the
	 * Arrays
	 */
	public static int validateStudents(Scanner Input, int validCount)
	{
		while (validCount <= 0)
		{
			System.out.print("\nError. Enter a positive whole number:");
			validCount = Input.nextInt();
		}
		return validCount;

	}// End of method

	public static void enterInfo(Scanner Input, double[] finalGrades, String[] firstNames)
	{

		for (int i = 0; i < firstNames.length; i++)
		{
			System.out.print("\nEnter first name for student " + (i + 1) + ": ");
			firstNames[i] = Input.next();

			System.out.print("Enter student final grade " + (i + 1) + ": ");
			finalGrades[i] = Input.nextDouble();

			while (finalGrades[i] < 0 || finalGrades[i] > 100)
			{
				System.out.print("Error. Grade must be netween 0-100: ");
				finalGrades[i] = Input.nextDouble();
			}

		}

	}// end of method

	public static double getAverage(double[] finalGrades)
	{
		double total = 0;

		for (int i = 0; i < finalGrades.length; i++)
		{
			total = total + finalGrades[i];
		}

		double average = total / finalGrades.length;

		System.out.print("\nClass average: " + average);

		return average;

	}// end of method

	public static void getAboveAvg(double[] finalGrades, String[] firstNames, double printAvg)
	{

		System.out.println("\nAbove average:");

		for (int i = 0; i < finalGrades.length; i++)
		{

			if (finalGrades[i] > printAvg)
			{
				System.out.println(firstNames[i] + ": " + finalGrades[i]);
			}

		}

	}// end of method

	public static void displayAllStudents(double[] finalGrades, String[] firstNames)
	{
		System.out.println("\nAll students:");

		for (int i = 0; i < finalGrades.length; i++)
		{
			System.out.println("Student " + (i + 1) + ": " + firstNames[i] + " - " + finalGrades[i]);
		}

	}

}// End of main
