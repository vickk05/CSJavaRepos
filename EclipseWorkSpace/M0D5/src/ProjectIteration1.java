import java.util.Scanner;


public class ProjectIteration1 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	//Call overview
	printProgramOverview();
	
	// Declaring Variables
	int numAthletes;
	
	
	//Prompt number of athletes and validated it 
	System.out.println("Enter the number of athletes on the team: ");
    numAthletes = input.nextInt();
    while (numAthletes <= 0) {
    System.out.println("\nError: value must be greater than 0.");
    System.out.print("Enter the number of athletes on the team: ");
    numAthletes = input.nextInt();
    }
    
    // Create arrays	
	String[] names = new String[numAthletes];
	double[] bmiValues = new double[numAthletes];
	double[] MaxHeartRate = new double[numAthletes];
	
	// Calling athlete data
	enterAthleteData(names, bmiValues, MaxHeartRate, input);
	
    // Displaying athlete summary
	displayAthleteSummary(names, bmiValues, MaxHeartRate);
	
	// Display BMI Analysis
	displayAthletesOutsideNormalBMI(names, bmiValues);
	
	// Calculate the average of max heart rate
	double averageMHR = calculateAvgMHR(MaxHeartRate);
	System.out.println("========== MHR Analysis ==========");
	System.out.printf("Average Max Heart Rate: %.1f\n\n", averageMHR);
	
	// Call the highest max heart rate
	displayHighestMHR(names, MaxHeartRate);
	
	// Call and display above average MHR
	displayAboveAverageMHR(names, MaxHeartRate, averageMHR);
	
	// Call and display training heart rate
	displayTrainingHeartRates(names, MaxHeartRate, input);
	}
	
	
	// Display program overview
	public static void printProgramOverview() {
	System.out.println("**************************************");
	System.out.println("Program Overview");
	System.out.println("**************************************\n");
	System.out.println("The trainer enters how many athletes are on the team.");
    System.out.println("Then the trainer enters each athlete's weight, height and age.");
    System.out.println("For each athlete, the program calculates BMI and max heart rate.");
	System.out.println("BMI Categories");
	System.out.println("Under 18.5: Underweight");
	System.out.println("18.5 to under 30: Normal");
	System.out.println("30 or greater: High\n");
	System.out.println("Calculates percentage of max heart rate for athlete training goal if needed");
	}
	
	
	// We get data for athletes' names, weight, and height.
	public static void enterAthleteData(String[] names, double[] bmiValues, double[] MaxHeartRate, Scanner input) {
	for (int i = 0; i < names.length; i++) {
	System.out.println("\nEnter data for athlete " + (i+1));
	System.out.print("Enter athlete's first name: ");
	names[i] = input.next();
	//Declare weight for while loop and to validate it
	double weight;
	System.out.print("Enter weight in pounds: ");
	weight = input.nextDouble();
	while (weight <= 0){
	System.out.println("\nError: value must be greater than 0.");
	System.out.print("Enter weight in pounds: ");
	weight = input.nextDouble();
	}
	//Declare height for while loop and to validate it
	double height;
	System.out.print("Enter height in inches: ");
	height = input.nextDouble();
	while (height <= 0) {
	System.out.println("\nError: value must be greater than 0.");
	System.out.print("Enter height in inches: ");
	height = input.nextDouble();
	}
	//Declare age for while loop and to validate it
	int age;
	System.out.print("Enter age in years: ");
	age = input.nextInt();
	while (age <= 0) {
	System.out.println("\nError: value must be greater than 0.");
	System.out.print("Enter age in years: ");
	age = input.nextInt();
	}
	// Now we declare and calculate the BMI
	double bmi = 703 * weight / (height * height);
	bmiValues[i]= bmi;
	// Declare heart rate and calculate
	double maxHeartRate = 220 - age;
	MaxHeartRate[i] = maxHeartRate;
	   }
	}
	
	// Here we display the athletes' information
	public static void displayAthleteSummary(String[] names, double[] bmiValues, double[] MaxHeartRate) {
	System.out.println("\n========== Athlete Summary ==========");
		
	for (int i = 0; i < names.length; i++) {
	System.out.println(names[i]);	
	System.out.printf("BMI: %.1f\n", bmiValues[i]);
	// We calculate the players' BMI
	if (bmiValues[i] < 18.5) {
	System.out.println("Category: Underweight");
	} else if (bmiValues[i] < 30) {
	System.out.println("Category: Normal");
	} else {
	System.out.println("Category: High");
	}
	System.out.printf("MHR: %.0f\n", MaxHeartRate[i]);
	System.out.println();
	  }
	}
	
	
	// Here we display athletes outside the normal BMI range
	public static void displayAthletesOutsideNormalBMI(String[] names, double[] bmiValues) {
	System.out.println("========== BMI Analysis ==========");
	boolean foundOutsideRange = false;
	for (int i = 0; i < names.length; i++) {
	if(bmiValues[i] < 18.5) {
	System.out.println("BMI below normal: " + names[i]);
	foundOutsideRange = true;
	} else if (bmiValues[i] >= 30) {
    System.out.println("BMI above normal: " + names[i]);
    foundOutsideRange = true;
	  }
	}
	if (foundOutsideRange == false) {
	System.out.println("No athletes outside of normal range");
	}
	System.out.println();
	}

	// Here we calculate and display the average max heart rate
	public static double calculateAvgMHR(double[] MaxHeartRate) {
	double sum = 0;
	for (int i = 0; i < MaxHeartRate.length; i++) {
	sum = sum + MaxHeartRate[i];
	}
	return sum / MaxHeartRate.length;
	}
	// Now we find the highest max heart rate and display it
	public static void displayHighestMHR(String[] names, double[] MaxHeartRate) {
	int maxIndex = 0;
	for (int i = 1; i < MaxHeartRate.length; i++) {
	if (MaxHeartRate[i] > MaxHeartRate[maxIndex]) {
	maxIndex = i;
	  }
	}
	System.out.println(names[maxIndex] + " has highest max heart rate: " + (int)MaxHeartRate[maxIndex]);
	System.out.println();
	}
	
	// Here we will display athletes above or equal to average max heart rate
	public static void displayAboveAverageMHR(String[] names, double[] MaxHeartRate, double averageMHR) {
	System.out.println("Athletes above or equal to average MHR:" );
	for (int i = 0; i < names.length; i++) {
	if(MaxHeartRate[i] >= averageMHR) {
	System.out.println(names[i]);
	  }
	}
	System.out.println();
	}
	// Calculate and display training rate
	public static void displayTrainingHeartRates(String[] names, double[] MaxHeartRate, Scanner input) {
	char choice;
    System.out.print("Do you want to calculate the training heart rates? (y/n): ");
    choice = input.next().charAt(0);
    
    while (choice != 'y' && choice != 'Y' && choice != 'n' && choice != 'N') {
    System.out.println("Error: must enter y, Y, n, or N.");
    System.out.print("Do you want to calculate the training heart rates? (y/n): ");
    choice = input.next().charAt(0);
    }
	if (choice == 'y' || choice == 'Y') {
	double percent;
	System.out.print("Enter training percentage: ");
	percent = input.nextDouble();
	
	while (percent<= 0) {
    System.out.println("Error: value must be greater than 0.");
	System.out.print("Enter training percentage: ");
	percent = input.nextDouble();
	}
	for (int i = 0; i < names.length; i++) {
	double trainingHR = MaxHeartRate[i] * percent / 100;
	System.out.printf("%s Training Heart Rate: %.1f\n", names[i], trainingHR);
	}
	System.out.println("\nTraining Program Analysis complete");
	}
	else {
    System.out.println("\nTraining Program Analysis complete");
	}

	
	}
}
	
