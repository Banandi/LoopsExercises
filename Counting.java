package com.perscholas.loops;

import java.util.Scanner;

public class Counting {
	/*Counts every number up to the inputed number from user
	 * 
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an number");//prompts user to enter number
		int num = input.nextInt();// input = num
		
		for (int i = 1 ; i < num +1 ; i++) { // if int i = 1, and  1 < num + 1, then continue program, 
			  								 //while adding 1 to i each iteration with i++ until i < num + 1 is no longer true
			System.out.print(i + " "); // print out i + " "
		}
		input.close(); //close scanner
	}
}
