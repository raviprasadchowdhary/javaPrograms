package org.example.strings;

import java.util.Scanner;

public class CheckIfStringIsPalindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String inpString = scan.nextLine();
		scan.close();

		System.out.println("Is input string palindrome: " + checkIfStringIsPalindrome(inpString));
		System.out.println("Is input string palindrome: " + checkIfStringIsPalindromeByStringBuilder(inpString));
	}

	/*
	 * =============================================================================
	 * Methods
	 * =============================================================================
	 */

	public static boolean checkIfStringIsPalindrome(String inpString) {
		int start = 0, end = inpString.length() - 1;
		while (start < end) {
			if (inpString.toUpperCase().charAt(start) != inpString.toUpperCase().charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	public static boolean checkIfStringIsPalindromeByStringBuilder(String inpString) {
		String reversedInpString = new StringBuilder(inpString).reverse().toString();

		return inpString.equalsIgnoreCase(reversedInpString);
	}
}
