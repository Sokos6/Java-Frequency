package WebFrequency;

import java.util.Scanner;

public class Calulator {
	// Simple addition calculator
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double fnum, snum, answer;
		System.out.println("Enter first number: ");
		fnum = keyboard.nextDouble();
		System.out.println("Enter second number: ");
		snum = keyboard.nextDouble();
		answer = fnum + snum;
		System.out.println(answer);
		
		keyboard.close();
	}

}
