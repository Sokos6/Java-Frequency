package WebFrequency;

//example of encapsulation ----These two classes would be in different files

class Calculation {
	int z;
	
	public void addition(int x, int y) {
		z = x + y;
		System.out.println("The sum of the given numbers:" + z);
	}
	
	public void Subtraction(int x, int y) {
		z = x - y;
		System.out.println("The difference between the given numbers:" + z);
	}

}
	
public class MyCalculation extends Calculation {
		
	public void multiplication(int x, int y) {
		z = x * y;
		System.out.println("The products of the given numbers:" + z);
	}
		
	public static void main(String[] args) {
		int a = 20, b = 10;
		MyCalculation demo = new MyCalculation();
		demo.addition(a, b);
		demo.Subtraction(a, b);
		demo.multiplication(a, b);
	}
	
}