import java.util.Scanner;

/* 
 * We ask the user to input a whole number.
 * The input will be stored in maxNUM.
 * We will pass down the maxNUM into the callNUM method.
 * The input will be stored in result that will return the value as an int.
 * 
 * 
*/
public class LabTest
{

	public static void main(String[] args)
	{
		Scanner Input = new Scanner(System.in);

		System.out.print("Enter a whole number: ");
		int maxNUM = Input.nextInt();

		int result = callNUM(maxNUM);

		System.out.println(result);
	}
	/*
	 * It is passed down here, and it'll continue to loop until the designated
	 * number is reached.
	 * 
	 * We create loopAdder to continue to add 1 while the loop runs.
	 */

	public static int callNUM(int maxNUM)
	{

		int result = 0;
		int loopAdder = 1;

		while (loopAdder <= maxNUM)
		{
			result = result + loopAdder;
			loopAdder++;
		}
//We return to main method here, if we dont return, the data will be deleted.
		return result;

	}

}
