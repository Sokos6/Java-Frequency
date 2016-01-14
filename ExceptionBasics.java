package WebFrequency;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionBasics {
	public static void main(String[] args) {
		int i =0;
		boolean done = false;
		do {
			try {
				Scanner input = new Scanner (System.in);
				System.out.print("Enter an interger: ");
				i = input.nextInt();
				input.close();
				done = true;
			} catch (InputMismatchException e) {
				System.out.println("You didn't enter and Integer.");
			} finally {
				System.out.println("This happens whether the exception occours or not.");
			}
		} while (!done);
	
	
	}
	

}
