package WebFrequency;

public class Triangled {

	double area;
	int height;
	int length;

	public static void main(String[] args) {
		int x = 0;

		Triangled[] ta = new Triangled[4];

		while (x < 4) {
			ta[x] = new Triangled();
			ta[x].height = (x + 1) * 2;
			ta[x].length = x + 4;
			ta[x].setArea();

			System.out.println("triangle " + x + ", area = " + ta[x].area);

			x = x + 1;
		}

		int y = x;
		x = 27;
		Triangled t5 = ta[2];
		ta[2].area = 343;
		System.out.print("y = " + y);
		System.out.println(", t5 area = " + t5.area);
	}
	void setArea() {
		area = (height * length) / 2;
	}
}
