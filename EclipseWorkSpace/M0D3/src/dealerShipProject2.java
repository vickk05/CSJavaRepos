import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class dealerShipProject2
{

	public static void main(String[] args)
	{
		displayProgramSummary();
		String fileName = "cars2.txt";
		try
		{
			System.out.println("\nTesting file: " + fileName);
			dealershipCars dealership = new dealershipCars("CS Dealership", 6);
			dealershipSetUp(fileName, dealership);
			dealership.displayCars();
			System.out.println("\nMost Expensive Car:");
			dealership.displayMostExpensiveCar();
			String outputFileName = dealership.getDealershipName() + ".txt";
			dealership.writeCarsToFile(outputFileName);
		} catch (FileNotFoundException exception)
		{
			System.out.println("Error: Unable to find file " + fileName);
		}
		System.out.println("\nEnd of program");
	}

	public static void dealershipSetUp(String fileName, dealershipCars newDealership) throws FileNotFoundException
	{
		File inputFile = new File(fileName);
		Scanner fileScanner = new Scanner(inputFile);
		while (fileScanner.hasNext())
		{
			String make = fileScanner.next();
			String model = fileScanner.next();
			double price = fileScanner.nextDouble();
			Car car = new Car(make, model, price);
			newDealership.addCar(car);
		}
		fileScanner.close();
	}

	public static void displayProgramSummary()
	{
		System.out.println("**************************************");
		System.out.println("Dealership and Car Analysis");
		System.out.println("**************************************");
		System.out.println("Reads car data from a file");
		System.out.println("Displays all cars");
		System.out.println("Finds most expensive car");
		System.out.println();
	}

}// end of main

class Car
{
	// car attributes
	private String make;
	private String model;
	private double price;

	// create car constructor
	Car(String make, String model, double price)
	{
		this.make = make;
		this.model = model;
		this.price = price;

	}

	// create the getters
	String getMake()
	{
		return make;
	}

	String getModel()
	{
		return model;
	}

	double getPrice()
	{
		return price;
	}

	void displayCarDetails()
	{
		System.out.println(make + " " + model + " $" + price);
	}

}// end of car class

class dealershipCars
{

	// Attributes
	private String name;
	private Car[] cars;
	private int currentNumberCars;
	private int maxNumCars;

	// Constructor
	dealershipCars(String name, int maxNumCars)
	{

		this.name = name;
		cars = new Car[maxNumCars];
		currentNumberCars = 0;
	}

	String getDealershipName()
	{
		return name;
	}

	void addCar(Car newCar)
	{
		if (currentNumberCars < maxNumCars)
		{
			cars[currentNumberCars] = newCar;
			currentNumberCars++;
		}

	}

	public void displayMostExpensiveCar()
	{

	}

	void displayCars()
	{

	}

	void writeCarsToFile(String outputFileName) throws FileNotFoundException
	{

		File outputFile = new File(outputFileName);
		PrintWriter fileWriter = new PrintWriter(outputFile);
		fileWriter.println("write information");
		fileWriter.close();
		System.out.println("Data written to file: " + outputFile.getAbsolutePath());

	}

}
