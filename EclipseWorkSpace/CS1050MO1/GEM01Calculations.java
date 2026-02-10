/**
 * Name: Victor Munoz
 * Class: CS1050(M/W)
 * Description: Guided Exploration 01  
 * The program will calculate a final grade for this class based on the category weights.
 */

public class GEM01Calculations 
{

	public static void main(String[] args) 
	{	// Our constants store info that stays the same while program run
		final double class_participation = 0.15;
		final double guided_exploration = 0.20;
		final double quizzes = 0.25;
		final double projects = 0.20;
		final double final_demo = 0.20;
		
		// Variable that stores information that can be different when program runs
		double class_avg = 60;
		double expo_avg = 85;
		double quiz_avg = 70;
		double pro_ject = 20;
		double demo_avg = 99;
		
		// The algorithm, multiply our average by the constant
		double finalgrade =
				(class_avg * class_participation) +
				(expo_avg * guided_exploration) +
				(quiz_avg * quizzes) +
				(pro_ject * projects) +
				(demo_avg * final_demo);
// Here we print our name and final grade.				
System.out.println("Name: Victor Munoz");
System.out.println("Final grade: " + finalgrade);
				
		
		
		
		
		
	}//main

}//Class GE01
