package WebFrequency;

public class ArrayTest {
	public static void main(String[] args) {
		int odds[] = { 1, 3, 5, 7, 9 };
		String bookInfo[][] = { { "Java In a Nutshell", "Flanagan" }, { "Core Java", "Horstmann" },
				{ "Thinking in Java", "Eckel" } };

		for (int i = 0; i < odds.length; i++) {
			System.out.println(odds[i]);
		}

		for (int i = 0; i < bookInfo.length; i++) {
			for (int j = 0; j < bookInfo[i].length; j++) {
				System.out.println(bookInfo[i][j] + " ");
			}
			System.out.println();
		}
	}
}
