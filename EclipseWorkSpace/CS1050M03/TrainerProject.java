import java.util.Scanner; 
public class TrainerProject {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		printSummary(); 
		
		double weight = getPositiveDouble(input, "Enter athlete weight: ");
		double height = getPositiveDouble(input, "Enter athlete height: ");
		System.out.println(weight);
		System.out.println(height);
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
		public static double getPositiveDouble(Scanner methodInput, String askQuestion)
		{
		double value = 0;
		
		while (value <= 0)
		{
		System.out.print(askQuestion);
		value = methodInput.nextDouble();
		
		if (value <= 0)
		{
		System.out.println("Error: value must be greater than 0.");
		}
		
	  }
		
		
		return value;
	}

}
