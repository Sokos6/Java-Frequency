package WebFrequency;

public class Fib {
	public static void main(String[] args) {
		int f0 = 0;
		int f1 = 1;
		int sum = 0;

		System.out.println(f0);
		System.out.println(f1);

		for (int i = 0; i < 18; i++) {
			sum = f0 + f1;
			System.out.println(sum);
			f0 = f1;
			f1 = sum;
		}
	}
}
