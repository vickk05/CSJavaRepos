import java.util.Scanner;

public class AnimalRescue
{

	public static void main(String[] args)
	{
		Scanner Input = new Scanner(System.in);

		// We print the overview of what the program will do.
		programOverView();

		// Here we ask the user to enter the amount of animals for the array.
		System.out.print("\nEnter the amount of animals: ");
		int amountAnimals = Input.nextInt();

		// We send down the input to verify the number is a positive integer.
		int verified = verifyAmount(Input, amountAnimals);

		/*
		 * Now that we have the number for how long the array will be, we verify and set
		 * the size of the elements for the arrays.
		 */
		String[] animalName = new String[verified];
		double[] weightLbs = new double[verified];
		double[] dailyFood = new double[verified];

		// We will call a method to put down all the dog information into the arrays.

		enterAnimalData(animalName, weightLbs, dailyFood, Input);

		// We print the Analysis Summary.
		rescueAnalysisSummary(verified, animalName, dailyFood);
	}// End of main

	public static void programOverView()
	{
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
	}

	// Verify amount of dogs for the data in the array.
	public static int verifyAmount(Scanner Input, int amountOfAnimals)
	{

		while (amountOfAnimals <= 0)
		{
			System.out.print("Error: Value must be greater than 0.");
			System.out.print("Enter a postive whole number:\n");
			amountOfAnimals = Input.nextInt();
		}

		return amountOfAnimals;

	}// End of method

	// Get info and validate for animal name, weight, and daily food into arrays.
	public static void enterAnimalData(String[] animalName, double[] weightLbs, double[] dailyFood, Scanner Input)
	{
		System.out.println("\nAnimal Entry");

		// I used a for loop to run through however many times the user put.
		for (int i = 0; i < animalName.length; i++)
		{
			System.out.println("========== Animal " + (i + 1) + " ==========");

			System.out.print("\nEnter animal name: ");
			animalName[i] = Input.next();

			// Get weight, and validate it to be a positive whole number.
			System.out.print("Enter weight in pounds: ");
			weightLbs[i] = Input.nextDouble();
			weightLbs[i] = validNum(Input, weightLbs[i]);

			// Get daily food amount in cups, and validate it as it repeats.
			System.out.print("Enter daily food amount in cups: ");
			dailyFood[i] = Input.nextDouble();
			dailyFood[i] = validNum(Input, dailyFood[i]);

			// We get the weight category and weekly food for each animal.
			String weightCategory = getWeightCategory(weightLbs[i]);
			double weeklyFood = getWeeklyFood(dailyFood[i]);

			// We print the animal summary after getting all the information we need for
			// that animal.
			printSummary(animalName[i], weightLbs[i], weightCategory, dailyFood[i], weeklyFood);

		}

	}// End of method

	/*
	 * For enterAnimalData method. This is the method we use to validate the weight
	 * and daily food. It will keep printing an error, until the number is not less
	 * than 0.
	 */
	public static double validNum(Scanner Input, double number)
	{

		while (number <= 0)
		{
			System.out.println("Error: Value must be greater than 0.");
			System.out.print("Enter again: ");
			number = Input.nextDouble();
		}

		return number;

	}// End of method

	/*
	 * For enterAnimalData method. We pass down the dailyFood for the index it is
	 * currently on, and return that animals weekly food. All we did here is
	 * multiply the daily food by a week.
	 */
	public static double getWeeklyFood(double dailyFood)
	{
		final int DAYS_WEEK = 7;
		return dailyFood * DAYS_WEEK;
	}// End of method

	/*
	 * For enterAnimalData method. We pass down the weightLbs index it is currently
	 * on and goes into a if-else statement. The multi-way statement, will return a
	 * string based on the weight of the animal and choose a category.
	 */
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

	}// End of method

	/*
	 * For enterAnimalData method. For each animal it will print a summary following
	 * the correct parallel index.
	 */
	public static void printSummary(String animalName, double weightLbs, String weightCategory, double dailyFood,
			double weeklyFood)
	{
		System.out.println("---------- Animal Summary ----------");
		System.out.println("Animal Name: " + animalName);
		System.out.printf("Weight: %.2f lbs\n", weightLbs);
		System.out.println("Weight Category: " + weightCategory);
		System.out.printf("Daily Food amount: %.2f cups\n", dailyFood);
		System.out.printf("Weekly Food Amount: %.2f cups\n\n\n", weeklyFood);
	}// End of method

	/*
	 * After all the data is gathered for each animal, we will print a summary. It
	 * displays the amount of animals, the total weekly food required, the average
	 * daily food per animal, and animals at or above average for food amount.
	 */
	public static void rescueAnalysisSummary(int verified, String[] animalName, double[] dailyFood)
	{
		final int DAYS_WEEK = 7;
		System.out.println("========== Rescue Analysis Summary ==========");
		System.out.println("Number of animals: " + verified);

		double totalFood = totalWeeklyFood(dailyFood);
		System.out.printf("Total Weekly Food required: %.2f cups\n", totalFood);

		double averageDailyFood = totalFood / DAYS_WEEK / verified;
		System.out.printf("Average Daily food per animal: %.2f  cups\n", averageDailyFood);

		System.out.println("Animals At or Above Average Daily Food Amount:");
		printAverageDailyFood(dailyFood, averageDailyFood, animalName);

	}// End of method

	/*
	 * For rescueAnalysisSummary method. Runs a for loop, inside thsi method we call
	 * another method to get the weekly food. This will add all the weekly food
	 * together.
	 */
	public static double totalWeeklyFood(double[] dailyFood)
	{
		double adder = 0;
		for (int i = 0; i < dailyFood.length; i++)
		{
			adder = adder + getWeeklyFood(dailyFood[i]);
		}
		double totalFood = adder;
		return totalFood;
	}

	/*
	 * For rescueAnalysisSummary method. We will pass down the dailyFood, and
	 * animalName array as well as the data that holds the average daily food. We
	 * will run a for loop, to go through each animal. If the animal is at average
	 * or higher, it will display the animal name and the animals daily food.
	 */
	public static void printAverageDailyFood(double[] dailyFood, double averageDailyFood, String[] animalName)
	{
		for (int i = 0; i < dailyFood.length; i++)
		{
			if (dailyFood[i] >= averageDailyFood)
			{
				System.out.printf("%s: %.2f cups\n", animalName[i], dailyFood[i]);
			}
		}
	}// End of method
}// End of class
