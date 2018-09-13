
public class FracCalcExtraCredit {
	public static void main(String[] args) {
		System.out.println(produceAnswer("5_3/4 - -6_8/8 - 5_3/4"));
	}
	public static String produceAnswer(String calc) {
		
		String splitUp[] = calc.split(" "); 
		String finalAnswer = "445"; //assigns recognition value to return string
		if (splitUp.length == 3) {
		}
		else {
			int calcLength = splitUp.length;
			//finalAnswer = calcLength + "";
			String a = "0";
			String b = "0";
			String c = "1";
			String lastFrac = splitUp[calcLength-1];
			if (lastFrac.contains("_")) {
				String splitLastFrac[] = lastFrac.split("_");
				String multiSplitLastFrac[] = splitLastFrac[1].split("/");
				a = splitLastFrac[0];
				b = multiSplitLastFrac[0];
				c = multiSplitLastFrac[1];
				finalAnswer = "whole:" + a + " numerator:" + b + " denominator:" + c;
			} else if(lastFrac.contains("/") && !(lastFrac.contains("_"))) {
				String splitLastFrac[] = lastFrac.split("/");
				b = splitLastFrac[0];
				c = splitLastFrac[1];
				finalAnswer = "whole:" + a + " numerator:" + b + " denominator:" + c;
			}
			else {
				a = lastFrac;
				finalAnswer = "whole:" + a + " numerator:" + b + " denominator:" + c;
			}			
		}
		
		
		
		
		return finalAnswer;
	}
}
