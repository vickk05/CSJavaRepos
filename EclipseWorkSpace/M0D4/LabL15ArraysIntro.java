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
	
	//loop to get input and store
	for (int i = 0; i < size; i++) {
	System.out.print("Enter name: ");
	firstNames[i] = input.nextLine();
	
	System.out.print("Enter grade: ");
	finalGrades[i] = input.nextDouble();
	input.nextLine();
	}
	// Find sum
	double sum = 0;
	for (int i = 0; i < finalGrades.length; i++) {
	sum = sum + finalGrades[i];
	}
	// Find average
	double average = sum/ finalGrades.length;
	System.out.println("Average: " + average);
	
	// Call method
	displayAboveAvg(firstNames, finalGrades, average);
	}
	 public static void displayAboveAvg (String[] names, double [] grades, double avg) {
     for (int i = 0; i < grades.length; i++) {
    System.out.println(names[i] + " " + grades[i]); 
     }
	
	}

}
