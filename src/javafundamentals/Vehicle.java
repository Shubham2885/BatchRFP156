package javafundamentals;

//class is blueprint/logical structure
public class Vehicle {

	//properties
	//instance variable
	byte numberOfwheels;
	byte numberOfGears;
	String fuelType;
	byte seatingCapacity;
	String color;
	String model;
	String brand;
	
	//static variable also called as class variable
	static short totalNumberVehicleProduce = 0;
	
	// access modifier -> return type -> functionName/methodName -> (number of parameters){}
	// 1 -> no return type and no parameters
	void running() {
		System.out.println("vehicle is running...");
	}
	
	static String getVehicleNumber() {
		return "MH40AB1234";
	}
	
	public static void main(String[] args) {
		
		// new Vehicle(); is called object creation
		Vehicle auto = new Vehicle();
		System.out.println("auto object = "+auto);
		
		Vehicle bus = new Vehicle();
		System.out.println("bus object = "+bus);
		
		Vehicle bike = new Vehicle();
		System.out.println("bike object = "+bike);
		
		
	}
}


