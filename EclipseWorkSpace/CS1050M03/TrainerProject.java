import java.util.Scanner; 
public class TrainerProject {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean continueProgram;
		int athleteCount = 0;
		
		printSummary(); 
		do
		{
		double weight = getPositiveDouble(input, "Enter athlete weight: ");
		double height = getPositiveDouble(input, "Enter athlete height: ");
		System.out.println(weight);
		System.out.println(height);
		
		double bmi = calculateBMI(weight, height);
		System.out.println("BMI value: " + bmi);
		
		String category = getBMICategory(bmi);
		System.out.println("BMI Category: " + category);
		
		if (bmi < 18.5)
		{
		System.out.println("Needs review");
		}
		athleteCount++;
		continueProgram = askToContinue(input);
		}
		while (continueProgram);
		System.out.println(athleteCount + " athlete calculations were completed.");
	     }

	
		public static void printSummary()
		{
		System.out.println("Team and Athlete Analysis");
		System.out.println("The trainer enters athlete data until they indicate they are done entering data. The trainer will enter each athlete’s weight and height");
		System.out.println("For each athlete entered, the BMI value and category will be displayed based on these BMI ranges.");
		System.out.println("Under 18.5: Underweight");
		System.out.println("18.5 to under 25: Normal");
		System.out.println("25 to under 30: Overweight");
		System.out.println("30 or greater: Obese ");
		}
		public static double getPositiveDouble(Scanner methodInput, String questionPrompt)
		{
		double value = 0;
		
		while (value <= 0)
		{
		System.out.print(questionPrompt);
		value = methodInput.nextDouble();
		
		if (value <= 0)
		{
		System.out.println("Error: value must be greater than 0.");
		}
		
	    }
		
		
		return value;
		}
		public static double calculateBMI(double weight, double height)
		{
	    double bmiValue = 703 * weight / (height * height);
		return bmiValue;
		}
		
		public static String getBMICategory(double currentBMI)
		{
		String category = "";
		
		if (currentBMI < 18.5)
		{
		category = "Underweight";
		}
		else if (currentBMI < 25)
		{
		category = "Normal";
		}
		else if (currentBMI < 30)
		{
		category = "Overweight";
		}
		else
		{
		category = "Obese";
		}
		return category;
		}
		
		public static boolean askToContinue(Scanner methodInput)
		{
		char choice = ' ';
		
		while (choice != 'y' && choice != 'Y' && choice != 'n' && choice != 'N')
		{
		System.out.print("Enter another athlete? (y/n): ");
		choice = methodInput.next().charAt(0);
		if (choice != 'y' && choice != 'Y' && choice != 'n' && choice != 'N')
		{
		System.out.println("Error: enter y or n");
		}
		}
		if(choice == 'y' || choice == 'Y')
		{
		return true;
		}
		else
		{
		return false;
		}
	}

}
