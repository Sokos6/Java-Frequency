package WebFrequency;

public class TempConv {
	
	float temp; 
	
	public static void main(String[] args) {
		float fahr = 212.0F;
		float cels = 0.0F;
		
		cels = fahrToCels(fahr);
		System.out.println(cels);
		
		cels = 0.0F;
		fahr = celsToFahr(cels);
		System.out.println(fahr);
		
	}
	
	static float fahrToCels(float f) {
		float c = (f -32) * 5F/9F;
		return c;
	}
	static float celsToFahr(float c) {
		float f = c * 9F/5F + 32;
		return f;
	}

}
