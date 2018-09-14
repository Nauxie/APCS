
public class FracCalcExtraCredit {
	public static void main(String[] args) {
		System.out.println(produceAnswer("5_3/4 - -6_7/8"));
	}
	public static String produceAnswer(String calc) {
		String splitUp[] = calc.split(" "); 
		int splitUpLength = splitUp.length;
		//String splitUpEC[] = calc.split("[ _/]"); 
		//integer calcLength = splitUpEC.length;
		String finalAnswer = "445"; //assigns recognition value to return string
		if (splitUp.length == 3) {
		}
		else {	
			String[] finalArray = new String[4*splitUpLength - 5];
			for(int i = 2; i <= finalArray.length; i += 4) {
				finalArray[i] = "1";
				
			}
			
		
					
		} 
		
		
		
		return finalAnswer;
	}
}
