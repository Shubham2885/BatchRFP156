package ds;

public class Main {

	public static void main(String[] args) {
		IStack stack = new Stack();
		System.out.println("---------------stack operation-------------------");
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
		
		stack.push(49);
		stack.push(30);
		
		stack.printData();
		System.out.println();
		System.out.println(stack.pop());
		
		stack.printData();
		System.out.println();
		System.out.println(stack.peek());
		stack.printData();
		
		System.out.println("---------------queue operation-------------------");
		IQueue queue = new Queue();

		System.out.println(queue.isEmpty());
		System.out.println(queue.size());
		
		queue.enqueue(69);
		queue.enqueue(20);
		
		queue.printData();
		System.out.println();
		System.out.println(queue.dequeue());
		
		queue.printData();
		System.out.println();

	}
}
