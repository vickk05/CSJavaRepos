import java.util.Scanner;

public class ClassTest
{

	public static void main(String[] args)
	{
		Scanner Input = new Scanner(System.in);

		System.out.println("Please enter a grade from 0-100:");
		double gradeFinal = Input.nextDouble();

		String letterGrade = findGrade(gradeFinal, Input);

		System.out.println(letterGrade);

	}

	public static String findGrade(double gradeCal, Scanner Input)
	{
		while (gradeCal < 0 || gradeCal > 100)
		{
			System.out.println("Invalid grade try again: ");
			gradeCal = Input.nextDouble();
		}

		String letter;

		if (gradeCal >= 90)
		{
			letter = ("Letter Grade: A");
		} else if (gradeCal >= 80)
		{
			letter = ("Letter Grade: B");
		} else if (gradeCal >= 70)
		{
			letter = ("Letter Grade: C");
		} else if (gradeCal >= 60)
		{
			letter = ("Letter Grade: D");
		} else
		{
			letter = ("Letter Grade: F");
		}

		return letter;

	}

}
