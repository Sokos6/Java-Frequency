package WebFrequency;

public class Local {
	// float
	static int total;

	public static void main(String[] args) {
		int count; // count is local to main

		for (count = 0; count <= 10; count++) {
			total += count;
		}

		if (total > 20) {
			int half; // half is local to the if block
			half = total / 2;
			System.out.println("total=" + total + ", half=" + half);
		}
		// The following line will not compile
		// System.out.println("total=" + total + ", half=" + half);

		System.out.println("total=" + total);

		printTotal();
	}

	static void printTotal() {
		System.out.println("printTotal: total=" + total);
	}
}
