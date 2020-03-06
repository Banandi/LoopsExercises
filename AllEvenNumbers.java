package com.perscholas.loops;

import java.util.Scanner;

public class AllEvenNumbers {
/*displays all the even numbers in the order before the number inputed by user 
 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");//prompts user to enter number
		int num = input.nextInt();//input = num
		
		for (int i = 1 ; i < num ; i++) { // if int i = 1, and  1 < num, then continue program, 
										  //while adding 1 to i each iteration with i++ until i < num is no longer true
			if(i % 2 == 0)	// if numbers remainders equal zero when divided by 2
			System.out.print(i + " "); // print out i + " "
			
		}
		input.close();
	}
}

