package WebFrequency;

import java.util.Random;
import java.util.Scanner;

// what is the bug in this code? 

public class GuessingGame {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		Random generator = new Random();

		final int MAX = 10;
		int answer, guess;
		String another = "y";
		boolean flag = false;
		boolean anotherFlag = true;

		while (anotherFlag) {
			answer = generator.nextInt(MAX + 1); // shift from (0-9) and makes
													// it [1-10]

			System.out.println("I'm thinking of a number between 1 and " + MAX + ". Can you guess what it is?");
			flag = false;
			while (!flag) {
				guess = keyboard.nextInt();

				if (guess == answer) {
					System.out.println("You guessed correctly! Good Job!");
					flag = true;
				} else {
					System.out.println("That is not correct, Sorry. Try again.");
				}
			}
			System.out.println();
			System.out.println("Would you like to play again? ");
			another = keyboard.next();
			if(another.equalsIgnoreCase("y") == true) {
				anotherFlag = true;
			} else {
				anotherFlag = false;
			}

			
		}
		keyboard.close();
	}
	
}
