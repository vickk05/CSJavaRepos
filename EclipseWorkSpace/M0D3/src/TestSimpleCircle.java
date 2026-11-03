
public class TestSimpleCircle
{
	/** Main method */
	public static void main(String[] args)
	{
		// Create a circle with radius 1
		SimpleCircle circle1 = new SimpleCircle();
		System.out.println("The area of the circle of radius " + circle1.getRadius() + " is " + circle1.getArea());

		// Create a circle with radius 25
		SimpleCircle circle2 = new SimpleCircle(25);
		System.out.println("The area of the circle of radius " + circle2.getRadius() + " is " + circle2.getArea());

		// Create a circle with radius 125
		SimpleCircle circle3 = new SimpleCircle(125);
		System.out.println("The area of the circle of radius " + circle3.getRadius() + " is " + circle3.getArea());

		// Modify circle radius
		circle2.setRadius(100); // or circle2.setRadius(100)
		System.out.println("The area of the circle of radius " + circle2.getRadius() + " is " + circle2.getArea());

		// Create 3 rectangle objects that prints area and perimeter (length, width)
		Rectangle rectangle1 = new Rectangle(1, 1);
		System.out.println("The area of rectangle1 is " + rectangle1.getArea());
		System.out.println("The perimeter of rectangle1 is" + rectangle1.getPerimeter());

	}
}

// Define the circle class with two constructors
class SimpleCircle
{
	private double radius;

	/** Construct a circle with radius 1 */
	SimpleCircle()
	{
		radius = 1;
	}

	/** Construct a circle with a specified radius */
	SimpleCircle(double newRadius)
	{
		radius = newRadius;
	}

	/** Return the area of this circle */
	double getArea()
	{
		return radius * radius * Math.PI;
	}

	/** Return the perimeter of this circle */
	double getPerimeter()
	{
		return 2 * radius * Math.PI;
	}

	/** Return the radius */
	double getRadius()
	{
		return radius;
	}

	/** Set a new radius for this circle */
	void setRadius(double newRadius)
	{
		radius = newRadius;
	}

}

// Created a new class
class Rectangle
{

	// Attributes of the rectangle
	private double length;
	private double width;

	// Create the constructor
	Rectangle(double newLength, double newWidth)
	{
		length = newLength;
		width = newWidth;
	}

	// Getter and return length.
	double getLength()
	{
		return length;
	}

	// Getter and returns width.
	double getWidth()
	{
		return width;
	}

	// Setter for length
	void setLength(double newLength)
	{
		length = newLength;
	}

	// Setter for width
	void setWidth(double newWidth)
	{
		width = newWidth;
	}

	// Calculate the area
	double getArea()
	{
		return length * width;
	}

	// Calculate the perimeter
	double getPerimeter()
	{
		return 2 * length * width;
	}

}
