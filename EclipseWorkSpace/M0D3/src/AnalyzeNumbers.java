
public class AnalyzeNumbers
{
	public static void main(String[] args) {
  3      java.util.Scanner input = new java.util.Scanner(System.in);
  4      System.out.print("Enter the number of items: ");
  5      int n = input.nextInt();
  6      double[] numbers = new double[n];
  7      double sum = 0;
  8  
  9      System.out.print("Enter the numbers: ");
 10      for (int i = 0; i < n; i++) {
 11        numbers[i] = input.nextDouble();
 12        sum += numbers[i];
 13      }
 14      
 15      double average = sum / n;
 16  
 17      int count = 0; // The number of elements above average
 18      for (int i = 0; i < n; i++)
 19        if (numbers[i] > average)
 20          count++;
 21  
 22      System.out.println("Average is " + average);
 23      System.out.println("Number of elements above the average is "
 24        + count);
 25    }
}
