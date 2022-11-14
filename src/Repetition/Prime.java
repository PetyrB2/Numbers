package Repetition;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");

		// Start Prime numbers
		int i;
		int num = 0;
		int maxCheck = sc.nextInt(); // maxCheck limit till which you want to find prime numbers
		boolean isPrime = true;

		// Empty String
		String primeNumbersFound = "";

		// Start loop 2 to maxCheck
		for (i = 2; i <= maxCheck; i++) {
			isPrime = CheckPrime(i);
			if (isPrime) {
				primeNumbersFound = primeNumbersFound + i + " ";
			}
		}
		System.out.println("Prime numbers from 1 to " + maxCheck + " are:");
		// Print prime numbers from 1 to maxCheck
		System.out.println(primeNumbersFound);
		System.out.println("");
		System.out.println("---------------------------------------------------------");
		System.out.println("Title: Prime Number Generator");
		System.out.println("Language: Java");
		System.out.println("Author: Peter");
		System.out.println("Notes: This program is for Integers only");
		System.out.println("---------------------------------------------------------");
	}

	public static boolean CheckPrime(int numberToCheck) {
		int remainder;
		for (int i = 2; i <= numberToCheck / 2; i++) {
			remainder = numberToCheck % i;
			// if remainder is 0 than numberToCheckber is not prime and break loop. Else
			// continue loop
			if (remainder == 0) {
				return false;
			}
		}
		return true;

	}// end prime

}
