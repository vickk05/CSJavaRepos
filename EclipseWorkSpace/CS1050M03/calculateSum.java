import java.util.Scanner;

public class calculateSum {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);	

	System.out.print("Enter a max number: ");
	int maxNumber = input.nextInt();

	int sum = calculateSum(maxNumber);

	System.out.println("The sum from 1 to " + maxNumber + " is " + sum);}

	public static int calculateSum(int currentMax)
    {
	int sum = 0;

	for (int i = 1; i <= currentMax; i++)
    {
	sum = sum + i;
	}

	return sum;	
		
	}

}
