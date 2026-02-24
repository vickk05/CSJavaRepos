

import java.util.Scanner;

public class ConcertTicketPrices {

	public static void main(String[] args) {
		//Scanner allows input
		Scanner input = new Scanner(System.in);
		
		// Here the use will pick a character for a section
		System.out.print("Enter one character for the section (F-Front, C-Center, S-Side, U-Upper): ");
		char section = input.next().charAt(0);
		// We use this to make the letter uppercase.
		section = Character.toUpperCase(section);
		
		// Now we create the multi-way if, else if, else statement.
		if (section == 'F' || section == 'C' || section == 'S' || section == 'U') {
		
		if (section == 'F') {
		System.out.println("You have selected front seats");
		}
		else if (section == 'C') {
		System.out.println("You have selected center seats");
		}
		else if (section == 'S') {
		System.out.println("You have selected side seats");
		}
		else {
		System.out.println("You have selected upper seats");
		}

		
		//Now we prompt for the row number
		System.out.print("Enter a row (1-60): ");
		int row = input.nextInt();
		int price;
		
		// Give prices for the row selected
		if (row >= 1 && row <= 60) {
			
		if (row <= 15){
		price = 450;
		}
		else if (row <= 30){
		price = 300;
		}
		else {
		price = 200;
		}
		
		System.out.println("Section " + section + " Row " + row + " Price " + price);
		}
		
		else {
		System.out.println("Invalid row selection, restart");
		}}
		
		
		else {
			System.out.println("Invalid section selection, restart");
		}
			
			
			
	}

}
