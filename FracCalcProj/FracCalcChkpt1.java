public class FracCalcChkpt1 {

	public static void main(String[] args) {
		System.out.println(produceAnswer("32 - 27/21"));
	}
	
	public static String produceAnswer(String calc) {
		String splitUp[] = calc.split(" ");

		return splitUp[2];
		
	}
	
}
