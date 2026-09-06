
/*
 *  Name: Victor Munoz
 *  Class: CS1050 T/TH
 *  Description: Guided Exploration 01      
 *  This program weights the categories of a class, and gets a singular students final grade.
 */


public class CS1050M01Fundamentals {

	public static void main(String[] args) {
		
		
	/* In this portion we will set our constants, which 
	 * will be our final grade categories and their weight.*/
	 
		final double CLASS_PARTICIPATION = .15;  
		final double GUIDED_EXPLORATION =  .20;
		final double QUIZ = .25;
		final double PROJECTS = .20;
		final double FINAL_DEMO = .20;
		
	/* In this second portion we will manually input the students
	 *	grade for each corresponding category. */

		double studentCP = 79;
		double studentGE = 87.5;
		double studentQ = 91;
		double studentP = 40.9;
		double studentFD = 95;
	
	/* In the this third portion we will get our final grade by
	 * multiplying the categories weight, to the students grade for the category. */
		
		double finalGrade = 
				(studentCP * CLASS_PARTICIPATION) +
				(studentGE * GUIDED_EXPLORATION) +
				(studentQ * QUIZ) +
				(studentP * PROJECTS) +
				(studentFD * FINAL_DEMO);
		
	// Now we display the course categories and their weight percentages. (This could be done in one print)
		System.out.println("Class categories with weight.");
		System.out.println("\nClass Participation: 15%");
		System.out.println("Guided Exploration: 20%");
		System.out.println("Quizzes: 25%");
		System.out.println("Projects: 20%");
		System.out.println("Final Demonstration: 20%");
	
	// All we do now is print the result of the final grade.
		
		System.out.println("\nStudent final grade: " + finalGrade);

	// End of code.
	}

}
