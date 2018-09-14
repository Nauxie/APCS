
public class FracCalcExtraCredit {
	public static void main(String[] args) {
		System.out.println(produceAnswer("5_3/4 * 6_7/8 * 3/4"));
	}

	public static boolean isNum(String strNum) {
		boolean ret = true;
		try {

			Integer.parseInt(strNum);

		} catch (NumberFormatException e) {
			ret = false;
		}
		return ret;
	}

	public static String produceAnswer(String calc) {
		String splitUp[] = calc.split(" ");
		int splitUpLength = splitUp.length;
		// String splitUpEC[] = calc.split("[ _/]");
		// integer calcLength = splitUpEC.length;
		String finalAnswer = "445"; // assigns recognition value to return string
		if (splitUp.length == 3) {
		} else {
			String splitUpArray[] = calc.split("[ _/]");
			int i = 0;
			while (i <= splitUpArray.length - 1) {
				if (isNum(splitUpArray[i + 2])) {
					int a = Integer.parseInt(splitUpArray[i]);
					int b = Integer.parseInt(splitUpArray[i + 1]);
					int c = Integer.parseInt(splitUpArray[i + 2]);
					int iNum1 = a * c + b;
					int iDen1 = c;
					finalAnswer = iNum1 + "" + iDen1;

				} else {
					finalAnswer = "333";
				}

			}

		}

		return finalAnswer;
	}
}
