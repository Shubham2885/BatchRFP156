package objectorientedprogramming;

import java.util.ArrayList;
import java.util.Date;

public class Demo {

	public static void main(String[] args) {
		
		//array declaration
		byte byteArray[];
		
		//array initilization
		byteArray = new byte[5];
		
		byteArray[0] = 1;
		byteArray[1] = 1;
		byteArray[2] = 1;
		byteArray[3] = 1;
		byteArray[4] = 1;
		
		for(byte i = 0; i < byteArray.length; i++) {
			byteArray[i] = (byte)(2 * i);
		}
		
//		byteArray[5] = 1; 
		
		int intArray[] = new int[10];
		
		double doubleArray[] = {2347, 0923874.0, 29384, 2384 };
		
		System.out.println(byteArray[0]);
		
		for(byte i = 0; i < 5; i++) {
			System.out.println(byteArray[i]);
		}
		
		int twoDArray[][] = new int[3][3];
		
		twoDArray[0][0] = 5;
		twoDArray[0][1] = 6;
		
		System.out.println(twoDArray[0][1]);
		
		for(int i=0;i<twoDArray.length;i++) {
			for(int j=0;j<twoDArray.length;j++) {
				twoDArray[i][j] = 2*i+1;
			}
		}
		
		
		for(int i=0;i<twoDArray.length;i++) {
			for(int j=0;j<twoDArray.length;j++) {
				System.out.print(twoDArray[i][j]+"\t");
			}
			System.out.println();
		}
		
		ArrayList<Student> intList = new ArrayList<Student>(); 
		for(int i =0 ;i<10;i++) {
			intList.add(new Student("fname"+i, "lname"+i, null, new Date()));
		}
		
		System.out.println(intList);
		
		
	}
}
