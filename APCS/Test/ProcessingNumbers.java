import java.util.*;

public class ProcessingNumbers {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers would you like to enter?");
		int numOfNum = input.nextInt();
		double max = 0;
		double min = 0;
		double evenSum = 0;
		double evenMax = 0;
		for (int i = 1; i <= (numOfNum - 1); i++) {
			if (i == 1) {
				System.out.println("Enter #" + i + ":");
				double num = input.nextDouble();
				if (num % 2 == 0) {
					evenSum = evenSum + num;
					evenMax = num;
				}
				max = num;
				min = num;
			}
			System.out.println("Enter #" + (i + 1) + ":");
			double num = input.nextDouble();
			if (num % 2 == 0) {
				evenSum = evenSum + num;
				evenMax = Math.max(num, evenMax);
			}
			max = Math.max(max, num);
			min = Math.min(min, num);

		}
		System.out.println("Your max is: " + max);
		System.out.println("Your min is: " + min);
		System.out.println("Sum of even numbers: " + evenSum);
		System.out.println("Largest even number: " + evenMax);
	}
}
