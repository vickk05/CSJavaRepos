import java.util.Scanner;

public class Kaylee
{

	public static void main(String[] args)
	{
		Scanner Input = new Scanner(System.in);

		System.out.println("Do you love Victor?");
		String loveVic = Input.next();
		String answer = mustLove(loveVic, Input);
		System.out.println("Do you love Victor? " + answer);
		System.out.println("Yay");
	}

	public static String mustLove(String loveVic, Scanner Input)
	{
		String mustbeYes = "Yes";

		while (!loveVic.equalsIgnoreCase("Yes"))
		{
			System.out.print("Yes is the only right answer. Try again:");
			loveVic = Input.next();
		}
		return loveVic;
	}

}
