package WebFrequency;

public class SphereMeth {
	static float PI = 3.14F;

	public static void main(String[] args) {
		int radius = 6;
		float circum = getCircum(radius);
		float volume = getVolume(radius);

		System.out.println("A sphere of radius ");
		System.out.print(radius);
		System.out.println(" has a circumference of ");
		System.out.print(circum);
		System.out.print(" and a volume of ");
		System.out.println(volume);
		System.out.println(" . ");
	}

	static float getCircum(float rad) {
		return rad * 2 * PI;
	}

	static float getVolume(float rad) {
		float vol = (4.0F / 3.0F) * PI * (float) Math.pow(rad, 3.0);
		return vol;
	}

}
