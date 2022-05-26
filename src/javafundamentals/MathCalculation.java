package javafundamentals;

public class MathCalculation {

	//default access modifier -> access within same package -> variable, method, classes
	//public access modifier -> access within the project...-> variable, method, classes
	//private access modifier -> access within the same class only -> variable, method, inner classes
	private int x = 5;
	private int y = 7;
	

	//1 -> return nothing and no pass parameters
	public static void printHello() {
		System.out.println("Hello Math Calculation...");
	}

	//2 -> return something and no pass parameters
	static double getPiValue(){
		return 3.142;
	}

	//3 -> return nothing and passing parameters
	void calculateAddtion() {
		int z = x + y;
		System.out.println("Result = "+ z);
	}

	//3 -> return nothing and passing parameters
	void calculateSub() {
		int z = x - y;
		System.out.println("Result = "+ z);
	}

	//3 -> return nothing and passing parameters
	void calculateMul() {
		int z = x * y;
		System.out.println("Result = "+ z);
	}

	//3 -> return nothing and passing parameters
	void calculateDiv() {
		int z = x / y;
		System.out.println("Result = "+ z);
	}



	static int getLengthOfString(String str) {
		int len = str.length();
		return len;
	}

	public static void main(String[] args) {

		MathCalculation calculation = new MathCalculation();
		calculation.x = 10;
		calculation.y = 5;
		
		MathCalculation calculation1 = new MathCalculation();
		calculation1.x = 30;
		calculation1.y = 10;
		
		MathCalculation.printHello();
		double pi = MathCalculation.getPiValue();
		System.out.println("Pi = "+pi);
		
		int len = MathCalculation.getLengthOfString("String");
		System.out.println("Length of String is = "+len);
		
		System.out.println("----------x = 10 and y = 5------------------");
		calculation.calculateAddtion();
		calculation.calculateSub();
		calculation.calculateMul();
		calculation.calculateDiv();
		
		System.out.println("----------x = 30 and y = 10------------------");
		calculation1.calculateAddtion();
		calculation1.calculateSub();
		calculation1.calculateMul();
		calculation1.calculateDiv();
		
		//access modifier
		//1 public 
		//2 private
		//3 protected
		//4 default
	}
}
