package com.perscholas.loops;

import java.util.Scanner;

public class ComplicatedPattern {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter * number");
		int num = input.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		input.close();
	}

}
