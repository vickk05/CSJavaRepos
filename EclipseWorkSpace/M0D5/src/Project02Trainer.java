import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Project02Trainer
{
	public static void main(String[] args)
	{
		displayProgramSummary();

		String fileName = "team1.txt";

		try
		{
			System.out.println("\nTesting file: " + fileName);

			Team team = new Team("Nuggets", 6);

			teamSetUp(fileName, team);

			runAnalysis(team);

		}
		catch (FileNotFoundException e)
		{
			System.out.println("Error: Unable to find file " + fileName);
		}

		fileName = "team2.txt";

		try
		{
			System.out.println("\nTesting file: " + fileName);

			Team team = new Team("Team CS", 4);

			teamSetUp(fileName, team);

			runAnalysis(team);

		}
		catch (FileNotFoundException e)
		{
			System.out.println("Error: Unable to find file " + fileName);
		}

		System.out.println("\nEnd of program");
	}

	public static void teamSetUp(String fileName, Team team) throws FileNotFoundException
	{
		File file = new File(fileName);
		Scanner inputFile = new Scanner(file);

		while (inputFile.hasNext())
		{
			String name = inputFile.next();
			double weight = inputFile.nextDouble();
			double height = inputFile.nextDouble();
			int age = inputFile.nextInt();

			Athlete athlete = new Athlete(name, weight, height, age);

			if (!team.addAthlete(athlete))
			{
				System.out.println("Team is full. Can't add " + name);
			}
		}

		inputFile.close();
	}

	public static void runAnalysis(Team team) throws FileNotFoundException
	{
		System.out.println("\n========== Team Analysis ==========");
		System.out.println("Team: " + team.getTeamName());
		System.out.println("Total Athletes: " + team.getAthleteCount());
		System.out.println();

		team.displayAthleteResults();
		team.displayAthletesOutsideNormalBMI();

		double avg = team.calculateAverageMaxHeartRate();
		System.out.println("\nAverage Max Heart Rate: " + avg);

		team.displayAthletesAboveAverageMHR(avg);
		team.displayHighestMHR();
		team.displaySmallestLargestHeight();

		String outputFile = team.getTeamName() + ".txt";
		team.writeAthletesToFile(outputFile);
	}

	public static void displayProgramSummary()
	{
		System.out.println("**************************************");
		System.out.println("Team and Athlete Analysis");
		System.out.println("**************************************");
		System.out.println("Reads athlete data from file");
		System.out.println("Displays athlete results");
		System.out.println("Performs team analysis");
		System.out.println("Writes results to file");
		System.out.println();
	}
}

// ================= ATHLETE =================

class Athlete
{
     private String name;
	private double weight;
	private double height;
	private int age;

	public Athlete(String name, double weight, double height, int age)
	{
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.age = age;
	}

	public String getName()
	{
		return name;
	}

	public double getHeight()
	{
		return height;
	}

	public double calculateBMI()
	{
		return (weight * 703) / (height * height);
	}

	public String getBMICategory()
	{
		double bmi = calculateBMI();

		if (bmi < 18.5)
			return "Underweight";
		else if (bmi < 25)
			return "Normal";
		else if (bmi < 30)
			return "Overweight";
		else
			return "High";
	}

	public int calculateMHR()
	{
		return 220 - age;
	}
}

// ================= TEAM =================

class Team
{
	private String teamName;
	private Athlete[] athletes;
	private int count;

	public Team(String teamName, int size)
	{
		this.teamName = teamName;
		athletes = new Athlete[size];
		count = 0;
	}

	public String getTeamName()
	{
		return teamName;
	}

	public int getAthleteCount()
	{
		return count;
	}

	public boolean addAthlete(Athlete athlete)
	{
		if (count >= athletes.length)
		{
			return false;
		}

		athletes[count] = athlete;
		count++;
		return true;
	}

	public void displayAthleteResults()
	{
		System.out.println("========== Athlete Summary ==========");

		for (int i = 0; i < count; i++)
		{
			Athlete a = athletes[i];

			System.out.println("\n" + a.getName());
			System.out.printf("BMI: %.1f\n", a.calculateBMI());
			System.out.println("Category: " + a.getBMICategory());
			System.out.println("MHR: " + a.calculateMHR());
		}
	}

	public void displayAthletesOutsideNormalBMI()
	{
		System.out.println("\nAthletes Outside Normal BMI Range:");

		for (int i = 0; i < count; i++)
		{
			Athlete a = athletes[i];
			String cat = a.getBMICategory();

			if (cat.equals("Underweight"))
			{
				System.out.println("Below normal: " + a.getName());
			}
			else if (!cat.equals("Normal"))
			{
				System.out.println("Above normal: " + a.getName());
			}
		}
	}

	public double calculateAverageMaxHeartRate()
	{
		double total = 0;

		for (int i = 0; i < count; i++)
		{
			total = total + athletes[i].calculateMHR();
		}

		return total / count;
	}

	public void displayAthletesAboveAverageMHR(double avg)
	{
		System.out.println("\nAthletes above or equal to average MHR:");

		for (int i = 0; i < count; i++)
		{
			if (athletes[i].calculateMHR() >= avg)
			{
				System.out.println(athletes[i].getName());
			}
		}
	}

	public void displayHighestMHR()
	{
		Athlete top = athletes[0];

		for (int i = 1; i < count; i++)
		{
			if (athletes[i].calculateMHR() > top.calculateMHR())
			{
				top = athletes[i];
			}
		}

		System.out.println("\nHighest Max Heart Rate:");
		System.out.println(top.getName() + ": " + top.calculateMHR());
	}

	public void displaySmallestLargestHeight()
	{
		Athlete shortest = athletes[0];
		Athlete tallest = athletes[0];

		for (int i = 1; i < count; i++)
		{
			if (athletes[i].getHeight() < shortest.getHeight())
			{
				shortest = athletes[i];
			}

			if (athletes[i].getHeight() > tallest.getHeight())
			{
				tallest = athletes[i];
			}
		}

		System.out.println("\nShortest Athlete:");
		System.out.println(shortest.getName() + " - " + shortest.getHeight());

		System.out.println("Tallest Athlete:");
		System.out.println(tallest.getName() + " - " + tallest.getHeight());	}

	public void writeAthletesToFile(String fileName) throws FileNotFoundException
	{
		PrintWriter output = new PrintWriter(fileName);

		output.println("Team: " + teamName);
		output.println("Total Athletes: " + count);

		for (int i = 0; i < count; i++)
		{
			Athlete a = athletes[i];

			output.println("\n" + a.getName());
			output.printf("BMI: %.1f\n", a.calculateBMI());
			output.println("Category: " + a.getBMICategory());
			output.println("MHR: " + a.calculateMHR());
		}

		output.close();

		System.out.println("\nResults written to file: " + fileName);
	}
}