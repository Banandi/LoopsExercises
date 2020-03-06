package com.perscholas.loops;

import java.util.Scanner;

public class AddingValues {
/*program made to add all the numbers a user inputs together
 * 
 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter number"); //print first prompt
		int response = input.nextInt(); // int response is input by user 
		int sum = 0; // variable sum is initialized

		while (response != 0) { //while response is NOT 0, do what's in the brackets

			sum += response; // sum = sum + response
			System.out.println("Keep entering numbers to add together. Enter 0 to exit"); // print 2nd prompt
			response = input.nextInt(); // int response is input by user

		}
		System.out.printf("The total sum for the number you entered is %d", sum); // print total prompt

		input.close(); //closes the scanner
	}

}
