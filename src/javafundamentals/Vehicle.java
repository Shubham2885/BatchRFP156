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


