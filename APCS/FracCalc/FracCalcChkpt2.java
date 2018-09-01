public class FracCalcChkpt2 {

	public static void main(String[] args) {
		System.out.println(produceAnswer("32 - 27/21"));
	}

	public static String produceAnswer(String calc) {
		String splitUp[] = calc.split(" ");
		String splitUpNum1First[] = splitUp[0].split("");
		

		return splitUpNum1First[1];
		
	}
}
