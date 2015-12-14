package WebFrequency;

public class Kids {
	public static void main(String[] args) {
		// int age = 9;
		int age = 14;
		// int age = 23;
		System.out.println("If youre age is " + age + " then you:");

		if (age < 16)
			System.out.println("Cannot drive.");
		else
			System.out.println("Can drive and have a job.");

		if (age < 12 && age > 3) {
			System.out.println("Order kid's meals.");
			System.out.println("Buy child movie ticket.");
		} else {
			System.out.println("Pay full price for meals.");
			System.out.println("Buy adult movie ticket.");
		}
	}
}
