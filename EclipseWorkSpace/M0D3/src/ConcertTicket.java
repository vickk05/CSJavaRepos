import java.util.Scanner;

public class ConcertTicket
{

	public static void main(String[] args)
	{
		Scanner KeyboardInput = new Scanner(System.in);

		System.out.println("Enter ONE character for section - F: Front C: Center S: Side U: Upper ");
		char section = KeyboardInput.next().charAt(0);
		section = Character.toUpperCase(section);

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
