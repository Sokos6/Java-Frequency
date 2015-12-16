package WebFrequency;

public class SDotComTestDrive {
	public static void main(String[] args) {
		SDotCom dot = new SDotCom();
		
		int[] locations = {2, 3, 4};
		dot.setLocationCells(locations);
		
		String userGuess = "2";
		String result = dot.checkYourself(userGuess);
		String testResult = "failed";
		
		if (result.equals("hit") ) {
			testResult = "passed";
		}
		
		System.out.println(testResult);
	}

}
