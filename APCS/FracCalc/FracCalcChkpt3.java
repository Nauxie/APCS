public class FracCalcChkpt3 {

	public static void main(String[] args) {
		System.out.println(produceAnswer("1_2/3 / -5_6/3"));
	}

	public static String produceAnswer(String calc) {
		String splitUp[] = calc.split(" ");

		String a = "0";
		String b = "0";
		String c = "1";
		String splitUpNum1Whole[] = splitUp[0].split("_");
		a = splitUpNum1Whole[0];

		if (splitUp[0].contains("_")) {
			a = splitUpNum1Whole[0];
			if (splitUpNum1Whole[1].contains("/")) {
				String splitUpNum1Frac[] = splitUpNum1Whole[1].split("/");
				b = splitUpNum1Frac[0];
				c = splitUpNum1Frac[1];
			}
		}
		if (splitUpNum1Whole[0].contains("/")) {
			String splitUpNum1Frac[] = splitUpNum1Whole[0].split("/");
			a = "0";
			b = splitUpNum1Frac[0];
			c = splitUpNum1Frac[1];
		}
		String d = "0";
		String e = "0";
		String f = "1";
		String splitUpNum2Whole[] = splitUp[2].split("_");
		d = splitUpNum2Whole[0];

		if (splitUp[2].contains("_")) {
			d = splitUpNum2Whole[0];
			if (splitUpNum2Whole[1].contains("/")) {
				String splitUpNum2Frac[] = splitUpNum2Whole[1].split("/");
				e = splitUpNum2Frac[0];
				f = splitUpNum2Frac[1];
			}
		}
		if (splitUpNum2Whole[0].contains("/")) {
			String splitUpNum2Frac[] = splitUpNum2Whole[0].split("/");
			d = "0";
			e = splitUpNum2Frac[0];
			f = splitUpNum2Frac[1];
		}
		int iA = Integer.parseInt(a);
		int iB = Integer.parseInt(b);
		int iC = Integer.parseInt(c);
		int iD = Integer.parseInt(d);
		int iE = Integer.parseInt(e);
		int iF = Integer.parseInt(f);
		if (splitUp[1].equals("+")) { // ADDITION SEQUENCE
			int finalWhole = iA + iD;
			if (iC == iF) {
				int finalNum = iB + iE;
				int finalDen = iC;
				String x = Integer.toString(finalWhole);
				String y = Integer.toString(finalNum);
				String z = Integer.toString(finalDen);

			}

		}
		return a;

	}
}
