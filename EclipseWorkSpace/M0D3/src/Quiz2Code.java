import java.util.Scanner;

public class Quiz2Code
{

	public static void main(String[] args)
	{

		Scanner Input = new Scanner(System.in);

		System.out.print("Enter a numeric grade: ");
		double numGrade = Input.nextDouble();

		if (numGrade < 0 || numGrade > 100)
		{
			System.out.println("Invalid Code");
		} else if (numGrade >= 90)
		{
			System.out.println("Letter Grade: A");
		} else if (numGrade >= 80)
		{
			System.out.println("Letter Garde:B");
		} else if (numGrade >= 70)
		{
			System.out.println("Letter Grade: C");
		} else if (numGrade >= 60)
		{
			System.out.println("Letter Grade:D");
		} else
		{
			System.out.println("Letter Grade: F");
		}

	}

}
