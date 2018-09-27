import java.util.*;

public class Hello {
	public static void main(String[] args) {
		Random rand = new Random();

		int position = 0;
		int maxPos = 0;
		System.out.println("position = " + position);
		while (Math.abs(position) < 10) {
			int a = rand.nextInt(2);
			if (a == 0) {
				position++;
				maxPos = Math.max(maxPos, position);
				System.out.println("position = " + position);

			} else {
				position--;
				System.out.println("position = " + position);
			}
		}
		System.out.println("max position = " + maxPos);
	}
}