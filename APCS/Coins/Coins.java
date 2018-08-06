// name:  
//
// program:  CoinsTester
//
// purpose:	This class accepts a certain number of monetary change.
//	        The output is a list of the number of quarters, dimes, nickels,
//	 		and pennies that will make that amount of change with the least
//	 		number of coins possible.  This is a skeleton that will be finished 
//	 	    by the students

public class Coins {

	// private variable to store the only attribute of a "Coins" object - how many
	// cents the
	// user wants to find change for.
	private int myChange;

	// constructor that accepts an initial value for the private data member
	public Coins(int change) {
		myChange = change;
	}

	// the method calculate will
	// 1. use modular and regular division to determine the quantity of each type of
	// coin
	// 2. prints the quantity of the coins needed to make the entered amount
	public void calculate() {
		// variable declarations to hold the values needed for different coin types
		// make sure you use descriptive identifiers!
		// ***** STUDENTS NEED TO COMPLETE ******

		// calculations for the various coin types
		// ***** STUDENTS NEED TO COMPLETE ******
		int i = myChange;
		int quarter = i / 25;
		i = i % 25;
		int dime = i / 10;
		i = i % 10;
		int nickel = i / 5;
		i = i % 5;
		int penny = i;

		// output statements, formatted as shown on spectacles
		// ***** STUDENTS NEED TO COMPLETE ******
		System.out.println(myChange + " cents  =>");
		System.out.println("Quarter(s): " + quarter);
		System.out.println("Dime(s): " + dime);
		System.out.println("Nickel(s): " + nickel);
		System.out.println("Penny(s): " + penny);
	}
}
