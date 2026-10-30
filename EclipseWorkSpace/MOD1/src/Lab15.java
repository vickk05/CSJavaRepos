import java.util.Scanner;

public class Lab15
{

	public static void main(String[] args)
	{
		Scanner Input = new Scanner(System.in);

		System.out.println("Enter the amount of students: ");
		int students = Input.nextInt();

		String[] firstNames = new String[students];
		double[] finalGrades = new double[students];

		System.out.println("Enter student names:");
		for (String index = 0; index < students; index++)
		{
			firstNames[index] = Input.next();

		}

		System.out.println("firstNames:" + firstNames);
		System.out.println("finalGrades:" + finalGrades);

	}

}
