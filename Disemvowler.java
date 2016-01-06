package WebFrequency;

import java.util.Scanner;

public class Disemvowler {
	
	private static char[] VOWELS = {'a', 'e', 'i', 'o', 'u'};
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		char[]input = keyboard.nextLine().toCharArray();
	
		for (int i = 0; i < input.length; i++) {
			if (isVowel(input[i])) {
				input[i] = ' ';
			}
		}
		
		System.out.println(printArrayWithoutSpaces(input));
			
		}
		
	

	private static String printArrayWithoutSpaces(char[] input) {
		String s = "";
		for (int i = 0; i < input.length; i++) {
			if (input[i] != ' ') s += input[i];
		}
		return s;
	}

	private static boolean isVowel(char c) {
		for (int i = 0; i < VOWELS.length; i++) {
			if (c == VOWELS[i]) return true;
		}
		return false;
		
	}

}
