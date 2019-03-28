package algorithms;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";

		// 1. Ask the user to enter their name
		String name = JOptionPane.showInputDialog(null, "What is you name?");
		// 2. Print upper case name to the console using .toUpperCase()
		name.toUpperCase();
		// Run your program to see that this works.

		// 3. Loop through each character of the name (steps 4 - 6).
		// HINT: Use .length() to determine the number of characters in the String.

		// 4. Create a String variable to store the next character of the name
		// using .substring(start, end)
		// HINT: replace 'start' and 'end' to get String with character at i

		String name1 = name.substring(0, 1).toUpperCase();
		String name2 = name.substring(1, 2).toLowerCase();
		String name3 = name.substring(2, 3).toUpperCase();
		String name4 = name.substring(3, 4).toLowerCase();
		String name5 = name.substring(4, 5).toUpperCase();

		String realname = name1 + name2 + name3 + name4 + name5;
		// 5. Use MODULO to set this variable to upper case for EVEN characters
		// and lower case for ODD characters.

		// 6. ADD this String (containing 1 char) to the goofyName String
		goofyName = realname + "";

		// 7. Use pop-up to show user their Goofy name
		JOptionPane.showMessageDialog(null, "You goofy name is: " + goofyName);
	}
}
