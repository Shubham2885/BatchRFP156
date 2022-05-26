package javafundamentals;

public class VariableAndDataTypeDemo {

	
	
	
	
	public static void main(String[] args) {
		System.out.println("Hello...");
		boolean abc = 1 > 2;
//		//there are two ways to write variable
//		
//		//declare the variable
//		String firstName;
//		//initilize the variable
//		String name = "Shubham";
		
		boolean isOK = 1 > 2;
		Boolean isOKObj = Boolean.valueOf(isOK);
		System.out.println();
		System.out.println("isOK = "+isOK);
		System.out.println("isOKObj = "+isOKObj);
		
		char oneChar = (char) 65+1;
		Character character = Character.valueOf(oneChar);
		System.out.println("character = "+character);
		
		System.out.println(oneChar);
		System.out.println((int)oneChar);
		
		byte number = 112;
		Byte byte1 = Byte.valueOf(number);
		System.out.println("byte1 = "+byte1);
		System.out.println(number);
		
		short num1 = 32767;
		
		long num2 = 929235792374928347l;
		float f = 57.89f;
		System.out.println("value of Boolean is = "+isOK);
		System.out.println(5.6);
		
		Vehicle auto = new Vehicle();
		auto.numberOfwheels = 3;
		System.out.println(auto);
		Vehicle bus = new Vehicle();
		bus.numberOfwheels = 3;
		System.out.println(bus);
		
		System.out.println(abc);
		
		Vehicle.totalNumberVehicleProduce = 9;
		
		//types of varabile
		//1 instance variable
		//2 static variable
		//3 local variable
		
		//type of method
		//1 instance method
		//2 static method
		auto.running();
		Vehicle.getVehicleNumber();
		
		//4 ways to right the methods
		
		//1 -> no return type and no parameters
		//2 -> return type and no parameters
		//3 -> no return type and pass parameters
		//4 -> return type and pass parameters
		
		
	}
}
