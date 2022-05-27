package javafundamentals;

public class Looping {

	public static void main(String[] args) {
		
		// there 3 types of loop in java
		// for loop
		// while
		// do while
		// advanced for loop
		// advanced forEach loop
		
		//syntax of for loop
		for(int i = 1 ; i <= 10; i++) {
			System.out.println(i*2);
		}
		
		int num = 12345;
		int sum = 0;
		while(num != 0) {
			int rem = num % 10;
			num = num / 10;
			sum = sum * 10 + rem;
		}
		
		System.out.println(sum);
		
		do {
			System.out.println("Shubham..");
		} while(1==2);
	}
}
