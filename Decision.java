package WebFrequency;

public class Decision {
	public static void main(String[] args) {

		char choice = 'a';

		switch (choice) {
		case 'a':
		case 'A':
			System.out.println("Adding");
			break;
		case 'd':
		case 'D':
			System.out.println("Deleting");
			break;
		case 'q':
		case 'Q':
			System.out.println("Quitting");
			break;
		default:
			System.out.println("Invalid selection");
			break;
		}
	}
}
