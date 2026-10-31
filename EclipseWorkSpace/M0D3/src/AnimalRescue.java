import java.util.Scanner;

public class AnimalRescue
{

	public static void main(String[] args)
	{
		Scanner Input = new Scanner(System.in);

		System.out.println("**************************************\n" + "Animal Rescue Center Analysis\n"
				+ "**************************************\n"
				+ "The rescue employee enters the number of animals currently in the rescue.\n"
				+ "For each animal, the employee enters:\n" + "- Name:\n" + "- Weight in pounds:\n"
				+ "- Daily food amount in cups:\n" + "The program analyzes the animal information to:\n"
				+ "- Calculate each animal's weekly food amount\n" + "- Categorize each animal by weight:\n"
				+ "Small: less than 20 lbs\n" + "Medium: 20 to less than 50 lbs\n" + "Large: 50 to less than 100 lbs\n"
				+ "Extra Large: 100 lbs or greater\n" + "- Calculate the average daily food amount for all animals\n"
				+ "- Identify animals that eat at or above the average daily food amount\n"
				+ "- Calculate the total amount of food needed for all animals for one week\n"
				+ "The program displays each animal's information and a summary of the rescue's food needs.");
		System.out.println("HElLO WORLD");

		// Here we ask the user to enter the amount of animals for the array.
		System.out.print("\nEnter the amount of animals: ");
		int amountAnimals = Input.nextInt();

		// We send down the input to verify the number is a positive integer.
		int verified = verifyAmount(Input, amountAnimals);

		/*
		 * Now that we have the number for how long the array will be, we verify and set
		 * the size of the elements for the arrays.
		 */
		String[] nameDogs = new String[verified];
		double[] weightLbs = new double[verified];
		double[] dailyFood = new double[verified];
		double[] weeklyFood = new double[verified];
		String[] weightCategory = new String[verified];

		// We will call a method to put down all the dog information into the arrays.

		putInfo(Input, nameDogs, weightLbs, dailyFood, weeklyFood, weightCategory);

		rescueAnalysisSummary(verified, weeklyFood, dailyFood, nameDogs);
	}// End of main

	// Verify amount of dogs for the data in the array.
	public static int verifyAmount(Scanner Input, int amountOfAnimals)
	{

		while (amountOfAnimals <= 0)
		{
			System.out.print("Enter a postive whole number:\n");
			amountOfAnimals = Input.nextInt();
		}

		return amountOfAnimals;

	}// End of method

	// Get info and validate for animal name, weight, and daily food into arrays. #2
	public static void putInfo(Scanner Input, String[] nameDogs, double[] weightLbs, double[] dailyFood,
			double[] weeklyFood, String[] weightCategory)
	{
		System.out.println("\nAnimal Entry");

		for (int i = 0; i < nameDogs.length; i++)
		{
			System.out.println("========== Animal " + (i + 1) + " ==========");

			System.out.print("\nEnter animal name: ");
			nameDogs[i] = Input.next();

			// Get weight, and validate it to be a positive whole number.
			System.out.print("Enter weight in pounds: ");
			weightLbs[i] = Input.nextDouble();
			weightLbs[i] = validNum(Input, weightLbs[i]);

			// Get daily food amount in cups, and validate it as it repeats.
			System.out.print("Enter daily food amount in cups: ");
			dailyFood[i] = Input.nextDouble();
			dailyFood[i] = validNum(Input, dailyFood[i]);

			weightCategory[i] = getWeightCategory(weightLbs[i]);
			weeklyFood[i] = getWeeklyFood(dailyFood[i]);

			System.out.println("---------- Animal Summary ----------");
			System.out.println("Animal Name: " + nameDogs[i]);
			System.out.printf("Weight: %.2f lbs\n", weightLbs[i]);
			System.out.println("Weight Category: " + weightCategory[i]);
			System.out.printf("Daily Food amount: %.2f cups\n", dailyFood[i]);
			System.out.printf("Weekly Food Amount: %.2f cups\n\n\n", weeklyFood[i]);
		}

	}// End of method

	public static double validNum(Scanner Input, double number)
	{

		while (number <= 0)
		{
			System.out.println("Error: Value must be greater than 0.");
			System.out.print("Enter again: ");
			number = Input.nextDouble();
		}

		return number;

	}

	public static double getWeeklyFood(double dailyFood)
	{
		final int DAYS_WEEK = 7;
		return dailyFood * DAYS_WEEK;
	}

	public static String getWeightCategory(double weightLbs)
	{
		final int SMALL_WEIGHT = 20;
		final int MEDIUM_WEIGHT = 50;
		final int LARGE_WEIGHT = 100;

		if (weightLbs < SMALL_WEIGHT)
		{
			return "Small";
		} else if (weightLbs < MEDIUM_WEIGHT)
		{
			return "Medium";
		} else if (weightLbs < LARGE_WEIGHT)
		{
			return "Large";
		} else
		{
			return "Extra Large";
		}

	}// end of method

	public static void rescueAnalysisSummary(int verified, double[] weeklyFood, double[] dailyFood, String[] nameDogs)
	{
		final int DAYS_WEEK = 7;
		System.out.println("========== Rescue Analysis Summary ==========");
		System.out.println("Number of animals: " + verified);

		double adder = 0;
		for (int i = 0; i < weeklyFood.length; i++)
		{
			adder = adder + weeklyFood[i];
		}
		double totalWeeklyFood = adder;
		System.out.printf("Total Weekly Food required: %.2f cups\n", totalWeeklyFood);

		double averageDailyFood = totalWeeklyFood / DAYS_WEEK / verified;
		System.out.printf("Average Daily food per animal: %.2f  cups\n", averageDailyFood);

		System.out.println("Animals At or Above Average Daily Food Amount:");
		for (int i = 0; i < weeklyFood.length; i++)
		{
			if (dailyFood[i] >= averageDailyFood)
			{
				System.out.printf("%s: %.2f cups\n", nameDogs[i], dailyFood[i]);
			}

		}

	}
}// End of class
