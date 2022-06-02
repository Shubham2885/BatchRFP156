package objectorientedprogramming;

import java.util.Date;
import java.util.Scanner;

class PrinterMachine {
	
	int x;
	
	public PrinterMachine() {
		
	}
	
	public PrinterMachine(int x) {
		this.x = x;
	}
	
	void print() {
		
	}
	
	void print(String doc) {
		
	}
	
	void print(double excelDoc) {
		
	}
	
	void print(int photos) {
		System.out.println("Printing photos on page... = "+photos);
	}
	
	void print(int photos, String doc) {
		System.out.println();
	}
	
	static void print(int x, int y) {
		
	}
	
	static void print(int x, int y, int z) {
		
	}
	
	void print(PrinterMachine machine) {
		System.out.println();
	}
	
	void print(Student student) {
		System.out.println(student);
	}
}

class PrintingMachine extends PrinterMachine {
	
	@Override
	void print(int photos) {
		System.out.println("Printing photos on banner... = "+photos);
	}
}

public class PolyDemo {

	public static void main(String[] args) {
		//
		PrinterMachine machine = new PrintingMachine();
		machine.print();
		machine.print(645);
		machine.print("Shubham");
		machine.print(645.6);
		PrinterMachine.print(5, 7);
		PrinterMachine.print(5, 7, 9);
		machine.print(machine);
		machine.print(new Student("Shubham", "Chavan", "", new Date()));
		
	}
}

//Type of Polymorphism

// Compile time -> static poly -> Method Overloading
// runtime time -> dynamic poly -> Method Overriding
