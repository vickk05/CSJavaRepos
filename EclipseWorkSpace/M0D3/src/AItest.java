import java.util.Scanner;

public class AItest
{

	public static void main(String[] args)
	{
		Scanner Input = new Scanner(System.in);

		double total = 0;

		for (int counter = 1; counter <= 3; counter++)
		{
			double grade = getGrade(Input);
			total = total + grade;
		}

		double average = total / 3;
		System.out.println("Avg::" + average);

		String letter = findGrade(average);
		System.out.println("Letter Grade:" + letter);
	}

	public static double getGrade(Scanner Input)
	{
		System.out.println("Enter grade:");
		double inputGrade = Input.nextDouble();

		while (inputGrade < 0 || inputGrade > 100)
		{
			System.out.println("Error, enter correct number:");
			inputGrade = Input.nextDouble();
		}

		return inputGrade;

	}

	public static String findGrade(double average)
	{
		String letter;
		if (average >= 90)
		{
			letter = "A";
		} else if (average >= 80)
		{
			letter = "B";
		} else if (average >= 70)
		{
			letter = "C";
		} else if (average >= 60)
		{
			letter = "D";
		} else
		{
			letter = "F";
		}
		return letter;

	}

}
