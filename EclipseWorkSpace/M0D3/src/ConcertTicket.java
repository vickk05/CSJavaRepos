import java.util.Scanner;

public class ConcertTicket
{

	public static void main(String[] args)
	{
		// Allows input from keyboard.
		Scanner KeyboardInput = new Scanner(System.in);

		/*
		 * We prompt the user to choose a section using a singular letter. We set the
		 * data type as char, its a singular character and read the input by next().
		 * Afterwards based on the letter inputed was lower case or not it will
		 * automatically upper case the section input.
		 */
		System.out.println("Enter ONE character for section - F: Front C: Center S: Side U: Upper ");
		char section = KeyboardInput.next().charAt(0);
		section = Character.toUpperCase(section);

		/*
		 * A multi-way if/else statement. This validates the input from the user,
		 * depending on the condition thats met it will print out which section was
		 * selected. If no condition is met, program ends.
		 */

		if (section == 'F')
		{
			System.out.println("\nSelected Front Section");
		} else if (section == 'C')
		{
			System.out.println("Selected Center Section");
		} else if (section == 'S')
		{
			System.out.println("Selected Side Section");
		} else if (section == 'U')
		{
			System.out.println("Selected Upper Section");
		} else
		{
			System.out.println("Invalid section, program ending");
			return;
		}

		/*
		 * Give the prices depending on the row. If the condition is met, it'll print
		 * out the section chosen, the row, and the price. If no condition is met, the
		 * program ends.
		 */
		System.out.println("\nRows 1-15: $450\nRows 16-30: $300\nRows 31-60: $200\nEnter row 1-60:");
		int row = KeyboardInput.nextInt();

		if (row >= 1 && row <= 15)
		{
			System.out.println("\nSection " + section + " Row " + row + " Price:$450");
		} else if (row >= 16 && row <= 30)
		{
			System.out.println("\nSection " + section + " Row " + row + " Price:$300");
		} else if (row >= 31 && row <= 60)
		{
			System.out.println("\nSection " + section + " Row " + row + " Price:$200");
		} else
		{
			System.out.println("Invalid row, program ending");
			return;
		}

	}

}
