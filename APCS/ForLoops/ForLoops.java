import java.util.Scanner; //import Scanner for usage in methods

public class ForLoops {

	public ForLoops() {
		// constructor
	}

	public void tableCreate() {
		@SuppressWarnings("resource") // get rid of leaking input
		Scanner input = new Scanner(System.in); // creates scanner variable
		System.out.println("Hi. How many rows would you like in the table?"); // asks reader for rows value
		int rows = input.nextInt(); // sets user input to rows
		System.out.println("How many columns?"); // asks reader for columns value
		int cols = input.nextInt(); // sets user input to cols
		int drawCol; // creates the variable that will dictate length of rows/print out numbers
		int drawRow; // creates the variable that will dictate the number of rows
		for (drawRow = 1; drawRow <= rows; drawRow++) { // creates new lines until runs until # of user inputed rows
														// have been reached
			for (drawCol = drawRow; drawCol <= cols * drawRow; drawCol += drawRow) { // starts at whatever # row it is,
																						// and increases till # of total
				// columns by whatever row number that is. each time it prints, it increases by
				// whatever # row it is
				System.out.print(drawCol + "	"); // ensures a tab between each number, but no space
			}
			System.out.println(); // creates a new line for each row
		}
	}

	public void oddCount() {
		@SuppressWarnings("resource") // get rid of leaking input
		Scanner input = new Scanner(System.in); // create scanner variable
		System.out.println(
				"Hi! Please enter any positive integer less than 80 and I will tell you all the odd numbers to it."); // user
																														// question
		int number = input.nextInt(); // set new variable equal to user input
		if (number < 80) { // method only works if user input is less than 80
			for (int ii = 1; ii < number; ii += 2) // starts at 1, runs until printed variable i is less than number
													// when
													// it increases by 2
				System.out.print(ii + " "); // prints i on the same line with a single space between each number
		} else { // what happens if user input is not less than 80
			System.out.println("That number is not less than 80! Please rerun the program to try again."); // error
																											// message
		}
	}

	public void dispLetters() {
		@SuppressWarnings("resource") // get rid of leaking input
		Scanner input = new Scanner(System.in); // creates Scanner variable
		System.out.println("Hello!. What is your favorite capital letter of the alphabet?"); // poses the user what is
																								// their fav. Capital
																								// letter
		char favLet = input.next().charAt(0); // Sets the character variable 'favLet' as the user's input
		int i = favLet;
		if (i > 64 & i < 91) {
			char lastLet = '['; // creates the variable to end at; when favLet equals this variable, code stops
			char frontLet = 'A';
			int l = 1;

			// for (char lastLet = '['; lastLet != frontLet; lastLet = (char) (lastLet - 1))
			// {
			while (lastLet != frontLet) {
				if (lastLet > favLet) {
					lastLet = (char) (lastLet - 1);
					System.out.print(lastLet + " ");

				} else if (l == 1) {
					System.out.println();
					l++;
				} else {

					lastLet = (char) (lastLet - 1);
					System.out.print(lastLet + " ");
				}
			}
		} else {
			System.out.println("Not a captial letter! Please re-run the program and try again.");
		}

	}

}
