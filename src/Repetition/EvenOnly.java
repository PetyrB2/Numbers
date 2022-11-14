package Repetition;

import java.util.Scanner;

public class EvenOnly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Evens Only
		
		evensOnly();
		oddsOnly();
}

//end main
	
		// Begin evensOnly()
	private static void evensOnly() {
		// TODO Auto-generated method stub

		System.out.println("");
		System.out.println("Evens");
		System.out.println("-----");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the highest number");
		int highest = sc.nextInt();
		int count = 0;
			
			while(count < highest) {
				
				if(count % 2 != 0) {
				count++;
				continue;
			
			}
			System.out.println(count);
			count++;
		}// end while
	}//end evensOnly()
	
	// oddsOnly
	private static void oddsOnly() {
		// TODO Auto-generated method stub
		int count2 = 0;
		System.out.println("");
		System.out.println("Odds");
		System.out.println("----");
		while(count2 < 10) {
			if(count2 % 2 == 0) {
				count2++;
				continue;
			}
			System.out.println(count2);
			count2++;
		}//end while
	}//end oddsOnly
	
	
	
}// EOF