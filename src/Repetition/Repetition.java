package Repetition;

public class Repetition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Begin While
		int count = 0;
		System.out.println("While Count");
		System.out.println("-----------");
		while(count < 10) {
			System.out.println("While Count : " + count);
			count++;
		}// end While
		
		
		loop();
		forLoop();
		
	}// end main

	private static void forLoop() {
		// TODO Auto-generated method stub
		System.out.println("\n\nFor Loop");
		System.out.println("--------");
		for(int i = 0; i < 15; i++) {
			System.out.println("For Loop Count : " + i);
		}
	}

	private static void loop() {
		// TODO Auto-generated method stub
		// Begin do while
		System.out.println("\n\nDo While Loop");
		System.out.println("-------------");
				int count2 = 0;
				do {
					System.out.println("Do \\ While Count : " + count2);
					count2++;
				}
				while(count2 < 10);
				// end do while
	}

}
