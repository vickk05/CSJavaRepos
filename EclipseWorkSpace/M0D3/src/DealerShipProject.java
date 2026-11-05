import java.util.Scanner;

public class DealerShipProject
{

	public static void main(String[] args)
	{
		Scanner Input = new Scanner(System.in);

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

}// end of car class

class dealershipCars
{

	// attributes
	private String name;
	private Car[] cars;
	private int currentNumberCars;

	// constructor
	dealershipCars(String name, int maxNumCars)
	{
		this.name = name;

	}

	getDealershipName()
	{
		return dealershipName;
	}

}
