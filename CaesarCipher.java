package WebFrequency;

import java.util.Scanner;

public class CaesarCipher {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Message to encode: ");
		StringBuilder messageToEncode = new StringBuilder(keyboard.nextLine().toLowerCase());
		
		System.out.println("Encoding Key: ");
		int key = keyboard.nextInt(); // max is 25
		
		System.out.println(encode(messageToEncode, key));
				
	
	}
	
	private static String encode(StringBuilder messageToEncode, int key) {
		for (int i = 0; i < messageToEncode.length(); i++) {
			char currentChar = messageToEncode.charAt(i); //messageToEncode[i]
			if (currentChar >= 97 && currentChar <= 122) {
				char newChar = (char) (currentChar + key);
				if (newChar > 122) {
					newChar = (char) (97 + (newChar - 123));
				}
				messageToEncode.setCharAt(i, newChar);
			}
		}
		return messageToEncode.toString();
	}
}
