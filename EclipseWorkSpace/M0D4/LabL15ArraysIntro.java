import java.util.Scanner;

public class LabL15ArraysIntro {

	public static void main(String[] args) {
	// Scanner to allow input
	Scanner input = new Scanner(System.in);
	
	// Ask how many students
	System.out.println("Enter number of students: ");
    int size = input.nextInt();
	input.nextLine();
	
	// Declare and construct
    double[] finalGrades = new double[size];
	String[] firstNames = new String[size];
	/
	// Updated, replaced loop with method call
	fillArrays(input, firstNames, finalGrades);
	
	//Updated: replaced sum + average with method
	double average = getAverage(finalGrades);
	System.out.println("Average: " + average);
	// Call method
	displayAboveAvg(firstNames, finalGrades, average);
	}
	// New method, moved input loop here
	public static void fillArrays(Scanner input, String[] names, double[] grades) {
	for (int i = 0; i < grades.length; i++) {
    System.out.print("Enter name: ");
	names[i] = input.nextLine();
	
	System.out.print("Enter grade: ");
	grades[i] = input.nextDouble();
	input.nextLine();
	}
	}
	// New method, calculates and returns average
	public static double getAverage(double[] grades) {
	double sum = 0;
	for (int i = 0; i < grades.length; i++) {
	sum = sum + grades[i];
	}
	return sum / grades.length;
	}
	
	
	public static void displayAboveAvg (String[] names, double [] grades, double avg) {
	for (int i = 0; i < grades.length; i++) {
    if (grades[i] > avg) {
    System.out.println(names[i] + " " + grades[i]); 
    }
   }
 }
}
