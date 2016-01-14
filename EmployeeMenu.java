package WebFrequency;

import java.util.Scanner;

public class EmployeeMenu {
	public static void main(String[] args) {
		//Create Scanner Object
		Scanner keyboard = new Scanner(System.in);
		
		//Declare variables
		int option =0;
		
		//Display the menu
		System.out.println("                      Employee File");
		System.out.println("                      --------------");
		System.out.println("             Option  Description");
		System.out.println("             ------  -----------");
		System.out.println("                0    Exit");
		System.out.println("                1    Enter a new employee");
		System.out.println("                2    View an existing employee");
		System.out.println("                3    Delete an ex-employee");
		System.out.println("                4    List all employees");
		System.out.print("Please choose an option: ");
		//read the user input
		option = keyboard.nextInt();
		keyboard.close();
		
		switch(option) {
		case 0:
			System.out.println("You chose option " + option + " to Exit");
			break;
		case 1:	
			System.out.println("You chose option " + option + " to Enter a new Employee");
			break;
		case 2:	
			System.out.println("You chose option " + option + " to View an existing employee");
			break;
		case 3: 
			System.out.println("You chose option " + option + " to Delete and ex-employee");
			break;
		case 4: 
			System.out.println("You chose option " + option + " to List all Employees");
			break;
		default:
			System.out.println("You chose an invalid option: " + option);
		}
		
	}
}
