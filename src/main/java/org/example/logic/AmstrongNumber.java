package org.example.logic;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number to be checked if it is Amstrong number: ");
		int input = scan.nextInt();
		scan.close();

		if (isAmstrongNumber(input)) {
			System.out.println(input + " is Amstrong number");
		}else {
			System.out.println(input + " is not a amstrong number");
		}

	}

	/*
	 * =============================================================================
	 * Methods
	 * =============================================================================
	 */

	public static boolean isAmstrongNumber(int input) {
		int sumOfCubes = 0, reminder, num = input;

		while(num>0) {
			reminder = num % 10;
			sumOfCubes += (reminder * reminder * reminder);
			num = num/10;
		}

		return sumOfCubes == input;
	}
}
