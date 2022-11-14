package Repetition;

import java.util.Random;
import java.util.Scanner;

public class DiceRandom {

	public static void main(String[] args) {
		System.out.println("========================");
		System.out.println("Title: Dice Roller");
		System.out.println("Genre: Java Intermediate");
		System.out.println("Author: Peter Broadbent");
		System.out.println("Language: Java \n" + "Version: " + System.getProperty("java.version"));
		System.out.println("Description:\n\tPick the amount of Dice to Roll and "
				+ "\n\tthe program will randomise the roll for you.");
		System.out.println("========================\n");
		System.out.println("");
		

		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		int diceVal;
		System.out.println("How Many Dice to Roll?\n\t");
		int dice = sc.nextInt();
		System.out.println("");

		for (int i = 0; i < dice; i++) {
			diceVal = random.nextInt(6) + 1;
			System.out.println("Die " + (i+1) + " is: \t" + diceVal);
			System.out.println("");
		}
	}

}
