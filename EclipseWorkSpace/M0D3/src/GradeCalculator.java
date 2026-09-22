
/*
 *  Name: Victor Munoz
 *  Class: CS1050 T/TH
 *  Description: Guided Exploration 02    
 *  This program weights the categories of a class, and gets a singular students final grade.
 */
import java.util.Scanner;

public class GradeCalculator
{

	public static void main(String[] args)
	{
		Scanner KeyboardInput = new Scanner(System.in);

		/*
		 * In this portion we will set our constants, which will be our final grade
		 * categories and their weight.
		 */

		final double CLASS_PARTICIPATION = .15;
		final double GUIDED_EXPLORATION = .20;
		final double QUIZ = .25;
		final double PROJECTS = .20;
		final double FINAL_DEMO = .20;

		// Now we display the course categories and their weight percentages. (This
		// could be done in one print)
		System.out.println("Welcome to the Course Grade Calculator!\n");

		System.out.println("This program calculates your final course"
				+ " grade using the weighted grades from each course category.");

		System.out.println("Course Categories with Weights:");
		System.out.println("\nClass Participation: 15%");
		System.out.println("Guided Exploration: 20%");
		System.out.println("Quizzes: 25%");
		System.out.println("Projects: 20%");
		System.out.println("Final Demonstration: 20%");

		System.out.print("\nEnter Student name:");
		String studentName = KeyboardInput.nextLine();

		System.out.print("\nEnter Class Participation grade:");
		double studentCP = KeyboardInput.nextDouble();

		System.out.print("Enter Guided Exploration grade:");
		double studentGE = KeyboardInput.nextDouble();

		System.out.print("Enter Quiz Grade:");
		double quiz = KeyboardInput.nextDouble();

		System.out.print("Enter Project Grade:");
		double project = KeyboardInput.nextDouble();

		System.out.print("Enter Final Demonstration Grade:");
		double finalDemo = KeyboardInput.nextDouble();

		System.out.print("\nStudent:" + studentName);

		double gradePercent = (studentCP * CLASS_PARTICIPATION) + (studentGE * GUIDED_EXPLORATION) + (quiz * QUIZ)
				+ (project * PROJECTS) + (finalDemo * FINAL_DEMO);
		System.out.print("\nFinal Course Grade:" + gradePercent + "%");

		if (gradePercent >= 90)
		{
			System.out.print("\nLetter Grade: A");
		} else if (gradePercent >= 80)
		{
			System.out.print("\nLetter Grade: B");
		} else if (gradePercent >= 70)
		{
			System.out.print("\nLetter Grade: C");
		} else if (gradePercent >= 60)
		{
			System.out.print("\nLetter Grade: D");
		} else
		{
			System.out.print("\nLetter Grade: F");

		}

	}

}
