package objectorientedprogramming;


class Animal {
	
	protected byte numberOfLegs;
	
	public Animal() {
		numberOfLegs = 2;
		System.out.println("Animal Constructor is called...");
	}

	protected void eating(){
		
	}
}

class Bird extends Animal {
	
	
	public Bird() {
		super();
		numberOfLegs = 2;
		System.out.println("Bird Constructor is called...");
	}
	
	public void flying() {
		
	}
}

class Dog extends Animal {
	
	public Dog() {
		super();
		numberOfLegs = 4;
		System.out.println("Dog Constructor is called...");
	}

	public void bark() {
		
	}
	
}

class Fish extends Animal {

	public void swim() {
		
	}
	
}

public class Main {

	public static void main(String[] args) {
//		Bird bird = new Bird();
//		bird.eating();
//		System.out.println(bird.numberOfLegs);
//		
//		Dog dog = new Dog();
//		System.out.println("Legs of dog = "+dog.numberOfLegs);
		
		String x = "hello";
		x.concat(" Shubham");
		
		System.out.println(x);
	}
}
