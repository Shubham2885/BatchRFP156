package javafundamentals;

public class IncrementAndDecrementOp {

	public static void main(String[] args) {
		int a = 1;
		a = a + 1;
		a += 1;

		//increment op by postfix
		int b = a++;
		System.out.println(b);
		System.out.println(a);

		//increment op by prefix
		int c = ++b;
		System.out.println("c = "+c);
		System.out.println("b = "+b);

		//decrement op by postfix
		b = a--;
		System.out.println("b = "+b);
		System.out.println("a = "+a);

		//decrement op by prefix
		c = --b;
		System.out.println("c = "+c);
		System.out.println("b = "+b);
		
		System.out.println(5<<2);
	}
}
