


import java.util.Scanner; 


public class L011 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String userName;
		String passWord;
		
		System.out.print("Enter your username: ");
		userName = input.next();
		
		System.out.print("Enter your Password: ");
		passWord = input.next();
		
		if (userName == "Test" || passWord == "p@$$") {
		
		if (userName == passWord){
		System.out.println("Logic successful! Welcome.");	
		}}
		
		else {
		System.out.println("Incorrect. Try again.");
		}
		
		
		
		
		
		
		
		
	}

}
