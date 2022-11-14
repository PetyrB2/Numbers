package Repetition;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		// Intro
		System.out.println("========================");
		System.out.println("Title: Use of Random()");
		System.out.println("Genre: Java Beginner");
		System.out.println("Author: Peter Broadbent");
		System.out.println("Language: Java \n" + "Version: " + System.getProperty("java.version"));
		System.out.println("========================\n");
		System.out.println("");
		// Begin Randomness
		Random random = new Random();
		int myRandomNumber;

		myRandomNumber = random.nextInt();
		System.out.println("First Random Number is: \n\t" + myRandomNumber);
		System.out.println("");

		// Limit Randomness
		myRandomNumber = random.nextInt(1000);
		System.out.println("Random Number 0 to 999: \n\t" + myRandomNumber);
		System.out.println("");

		// Shifting so never 0
		myRandomNumber = random.nextInt(1000) + 1;
		System.out.println("Random Number - 1 to 1000: \n\t" + myRandomNumber);
		System.out.println("");
	}
}
