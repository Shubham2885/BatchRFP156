package javafundamentals;

public class BasicControlStatement {

	public static void main(String[] args) {
		
		byte a = 100;
		byte b = 50;
		byte c = 80;
		byte d = 101;
		
		
		String str = "Welcome"; 	// string literls
		String str2 = "Welcome";
		String str3 = new String("Shubham");
		String str4 = new String("Shubham");
		
		System.out.println("str == str2 =>"+(str == str2));
		System.out.println("str3 == str4 =>"+(str3.equals(str4)));
		
		boolean condition = false;
		
		System.out.println("a < b = "+(a<b));
		System.out.println("a > b = "+(a>b));
		System.out.println("a <= b = "+(a<=b));
		System.out.println("a >= b = "+(a>=b));
		System.out.println("a == b = "+(a==b));
		System.out.println("a != b = "+(a!=b));
		
		
		
		if(condition) {// condition = true
			System.out.println("if block is executed...");
			// statements executed 
		}else {
			System.out.println("else block is executed...");
		}
		
		// two variable comparision
		if(a > b) {// condition = true
			System.out.println("a is greater...");
		}else {
			System.out.println("b is greater...");
		}
		
		//using of turnary
//		String result = a > b ? "a is greater..." : "b is greater..." ;
		System.out.println("Result of Turnary op = "+(a > b ? "a is greater..." : "b is greater..."));
		
		
		// three variable comparision
		if(a > b && a > c) {// condition = true
			System.out.println("a is greater...");
		}else if(b > a && b > c){
			System.out.println("b is greater...");
		}else {
			System.out.println("c is greater");
		}
		
		System.out.println("Result of Turnary three op = "+(a > b && a > c ? "a is greater..." : (b > a && b > c) ? "b is greater..." : "c is greater"));
		
		// four variable comparision
		if(a > b && a > c && a > d) {// condition = true
			System.out.println("a is greater...");
		}else if(b > a && b > c && b > d){
			System.out.println("b is greater...");
		}else if(c > a && c > b && c > d){
			System.out.println("c is greater");
		}else {
			System.out.println("d is greater");
		}
		
		System.out.println("others statement are executed...");
	}
}

/* multi line comments...
using and logical op
op1 	op2	resutl
true	true	true
false	true 	false
true	false	false
false	false	false


using or logical op
op1 	op2	result
true	true	true
false 	true	true
true	false	true
false	false	false

*/